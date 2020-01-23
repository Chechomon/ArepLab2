package com.proyecto.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void mediaTest() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
        String line = null;
        LinkedList<Double> lista = new LinkedList<Double>();
        while ((line = br.readLine()) != null) {
            lista.add(Double.parseDouble(line));
        }
        Double value = Main.media(lista);
        assertEquals(String.format(Locale.US, "%.2f", value),"550.60");
    }
    
    @Test
    public void desviacionEstandarTest() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
        String line = null;
        LinkedList<Double> lista = new LinkedList<Double>();
        while((line = br.readLine()) != null){
            lista.add(Double.parseDouble(line));
        }
        Double value = Main.desviacionEstandar(lista);
        assertEquals(String.format(Locale.US, "%.2f", value),"572.03");
    }

}
