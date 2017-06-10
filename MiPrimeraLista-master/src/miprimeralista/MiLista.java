 
package miprimeralista;

import collection.Lista;
import collection.ListaCircular;
import collection.ListaDoble;
 
public class MiLista {
 
    public static void main(String[] args) {
        
        ListaDoble miLista = new ListaDoble();
        miLista.addLast(0);
        miLista.addLast(1);
        
        
//        
//        System.out.println(miLista.getSize());
//        
//        miLista.remove(1);
//        
//        System.out.println(miLista.size());
//        
//        System.out.println("*cabeza*" +miLista.getCabeza().getSig().getDato());
//        
//        System.out.println("-*ultimo*"+miLista.getUltimo().getDato());
//        
        System.out.println("To String: " +miLista.toString());
        miLista.remove(1);
        miLista.remove(0); 
        System.out.println("To String: " +miLista.toString());
//        System.out.println("IndexOf "+miLista.indexOf(7));
//        System.out.println("InIndex "+miLista.getData(2));
//        System.out.println(miLista.size());
//        
//        miLista.remove(3);
//        
//        System.out.println(miLista.size());
//        
//        miLista.remove(0);
//        
//        System.out.println(miLista.size());
    }
    
}
