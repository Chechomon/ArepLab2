package com.proyecto.demo;

/**
 *
 * @author sergio.pena
 */
public class Operaciones {

    /**
     * Metodo que calcula la media de los numeros en una lista encadenada
     * @param linkedList lista de numeros 
     * @return media de los numeros en la lista 
     */
    public static double media(LinkedList<Double> linkedList){
        Nodo<Double> pointer = linkedList.getPrimero();
        double media = 0;
        while (pointer != null) {
            media+= pointer.getValor();
            pointer = pointer.getSiguiente();
        }
        return media/linkedList.getTamano();
    }

    /**
     * Metodo que calcula la desviacion estandar de los numeros en una lista encadenada
     * @param linkedList lista de numeros
     * @return desviacion estandar de los numeros en la lista 
     */
    public static double desviacionEstandar(LinkedList<Double> linkedList){
        double mean =  media(linkedList);
        Nodo<Double> pointer = linkedList.getPrimero();
        double stdDev = 0;
        while (pointer != null) {
            stdDev+= Math.pow(pointer.getValor() - mean,2);
            pointer = pointer.getSiguiente();
        }
        return Math.sqrt(stdDev/(linkedList.getTamano()-1));
    }
}
