package com.proyecto.demo;

/**
 *
 * @author sergio.pena
 */
public class Cabeza<V> {
    private Nodo<V> pri;
    private Nodo<V> ult;

    /**
     * Constructor para la cabeza de la lista encadenada
     * @param pri primer nodo de la lista
     * @param ult ultimo nodo de la lista
     */
    public Cabeza(Nodo<V> pri, Nodo<V> ult){
        this.pri = pri;
        this.ult = ult;
    }

    public Nodo<V> getPrimero(){
        return pri;
    }

    public void setPrimero(Nodo<V> nodo){
        pri = nodo;
    }
    
    public Nodo<V> getUltimo(){
        return ult;
    }

    public void setUltimo(Nodo<V> nodo){
        ult = nodo;
    }
}
