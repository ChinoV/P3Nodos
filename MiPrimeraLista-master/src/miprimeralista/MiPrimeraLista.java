 
package miprimeralista;

import collection.Lista;
 
public class MiPrimeraLista {
 
    public static void main(String[] args) {
        
        Lista miLista = new Lista();
        miLista.add(5);
        miLista.add(1);
        miLista.add(2);
        miLista.add(7);
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
        System.out.println("IndexOf "+miLista.indexOf(7));
        System.out.println("InIndex "+miLista.getData(2));
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
