package com.proyecto.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author sergio.pena
 */
public class Main {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
        String line = null;
        LinkedList<Double> linkedList = new LinkedList<Double>();
        while((line = bufferedReader.readLine()) != null){
            linkedList.add(Double.parseDouble(line));
        }
        System.out.printf(Locale.US,"%.2f\n",media(linkedList));
        System.out.printf(Locale.US,"%.2f\n",desviacionEstandar(linkedList));
    }

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
