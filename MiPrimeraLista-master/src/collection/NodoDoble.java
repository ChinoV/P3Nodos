
package collection;

public class NodoDoble {
    private int dato;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDoble getSig() {
        return sig;
    }
    
    public NodoDoble getAnt() {
        return ant;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }
    
    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
}
