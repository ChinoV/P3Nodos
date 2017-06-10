
package collection;

public class Lista {

    private Nodo cabeza;
    private Nodo ultimo;
    private int size;

    public Lista() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo _cabeza) {
        this.cabeza = _cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo _ultimo) {
        this.ultimo = _ultimo;
    }


    public int getSize() {
        return size;
    }

//    <h1>Add</h1>
//    <p>Agrega un elemento al final de la lista.</p>
    
    public boolean addLast(int data) {
        Nodo nuevo = new Nodo(data);
        if (0 == size) {
            cabeza = nuevo;
            ultimo = nuevo; 
        }else{
            ultimo.setSig(nuevo);
            ultimo = nuevo; 
        }
        size++;
        return true;
    }
    
    public boolean addFirst(int data) {
        Nodo nuevo = new Nodo(data);
        if (0 == size) {
            cabeza = nuevo;
            ultimo = nuevo; 
        }else{
            nuevo.setSig(cabeza);
            cabeza = nuevo; 
        }
        size++;
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder x= new StringBuilder();
        
        Nodo aux=cabeza;
        for (int i = 0; i < this.size; i++) {
            x.append(aux.getDato());
            x.append(" ");
            aux=aux.getSig();
        }
        return x.toString();
    }
    
    public int indexOf(int x)
    { 
        int index=-1;
        Nodo aux=cabeza;  
        
        for (int i = 0; i < size; i++) {
            if(aux.getDato()==x)
            {
                index=i; 
                break;
            }
            aux=aux.getSig();
        }
        return index;
    }
     
    public int getData(int index) {
        
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }else{
            Nodo aux = cabeza;
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
    
    public int get(int index) {
         
        if (0 == size) {
            return -1;
        } else if (index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0){
            return cabeza.getDato();
        } else if (index == size) {
            return ultimo.getDato();
        } else {
            Nodo aux = cabeza;
            int cont = 0;
            
            while (aux.getSig() != null && cont < index) {
                aux = aux.getSig();
                ++cont;
            }
            
            return aux.getDato();
        }
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
            size--;
            return true;
        }
        Nodo aux = this.cabeza; 
        for (int i = 0; i < size; i++) {
          if(index-1==i)
          {
              aux.setSig(aux.getSig().getSig()); 
              size--;
              return true;
          }
          aux=aux.getSig();
        } 
        return false;
    }

}