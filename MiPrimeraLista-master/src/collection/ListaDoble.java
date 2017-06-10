
package collection;

public class ListaDoble {

    private NodoDoble cabeza;
    private int size;

    public ListaDoble() {
        this.cabeza = null; 
        this.size = 0;
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble _cabeza) {
        this.cabeza = _cabeza;
    }  
    public int getSize() {
        return size;
    }
 
    public boolean addLast(int data) {
        NodoDoble nuevo = new NodoDoble(data);
        if (0 == size) {
            cabeza = nuevo; 
        }else{ 
            NodoDoble aux = this.cabeza;
            while(aux.getSig()!=null)
            {
                aux=aux.getSig();
            }
            nuevo.setAnt(aux);
            aux.setSig(nuevo);
        }
        size++;
        return true;
    }
    
    public boolean addFirst(int data) {
        NodoDoble nuevo = new NodoDoble(data);
        if (0 == size) {
            cabeza = nuevo;  
        }else{
            nuevo.setSig(cabeza);
            cabeza.setAnt(nuevo);
            cabeza = nuevo; 
        }
        size++;
        return true;
    }
    
    public boolean add(int data, int index)
    {
        if(index>size-1|| index<0){
            throw new IndexOutOfBoundsException();
        }
        
        NodoDoble nuevo = new NodoDoble(data); 
        if (0 == size) {
            cabeza = nuevo; 
        }
        NodoDoble aux = this.cabeza;
        
        for (int i = 0; i < size; i++) 
        {
            if(index==i)
            {
                if(aux.getAnt()!=null){ 
                    nuevo.setAnt(aux.getAnt()); 
                    nuevo.getAnt().setSig(nuevo); 
                }
                else
                {
                    nuevo=cabeza;
                }                
                nuevo.setSig(aux); 
                nuevo.getSig().setAnt(nuevo);
                ++size;
                return true;
            }
            aux=aux.getSig();
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder x= new StringBuilder();
        
        NodoDoble aux=cabeza;
        for (int i = 0; i < this.size; i++) {
            x.append(aux.getDato());
            x.append(" ");
            aux=aux.getSig();
        }
        return x.toString();
    }
    
    public int indexOf(int x)
    {  
        NodoDoble aux=cabeza;  
        
        for (int i = 0; i < size; i++) {
            if(aux.getDato()==x)
            {
                return i;  
            }
            aux=aux.getSig();
        }
        return -1;
    }
     
    public int get(int index) {
        
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }else{
            NodoDoble aux = cabeza;
            for (int i = 0; i < size; i++) 
            {
                if(i==index)
                {
                    return aux.getDato();
                }
                aux=aux.getSig();
            }
        }
        return -1;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    
    public boolean remove(int index) 
    {
        if(index>size-1|| index<0){
            throw new IndexOutOfBoundsException();
        }
        if(index==0)
        {
            this.cabeza=this.cabeza.getSig();
            if( this.cabeza!=null)
            {
                this.cabeza.setAnt(null);
            }
            size--;
            return true;
        }
        NodoDoble aux = this.cabeza; 
        for (int i = 0; i < size; i++) {
          if(index==i)
          {
              aux.getAnt().setSig(aux.getSig());
              if(aux.getSig()!=null)
              {
                aux.getSig().setAnt(aux.getAnt());
              }
              size--;
              return true;
          }
          aux=aux.getSig();
        } 
        return false;
    }

}