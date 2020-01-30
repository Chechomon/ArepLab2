package com.proyecto.demo;

import static spark.Spark.*;
import spark.QueryParamsMap;
/**
 *
 * @author sergio.pena
 */
public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");

        post("/mean",(req, res) -> {
            QueryParamsMap map = req.queryMap();
            String[] nums = map.get("numbers").value().split("\n");
            LinkedList<Double> linkedList =  new LinkedList<Double>();
            for(String num : nums){
                linkedList.add(Double.parseDouble(num));
            }
            return Operaciones.media(linkedList);
        });

        post("/deviation",(req, res) -> {
            QueryParamsMap map = req.queryMap();
            String[] nums = map.get("numbers").value().split("\n"); 
            LinkedList<Double> linkedList =  new LinkedList<Double>();
            for(String num : nums){
                linkedList.add(Double.parseDouble(num));
            }
            return Operaciones.desviacionEstandar(linkedList);
        });
    }
    
    /**
     * Metodo que asigna el puerto por el cual correr dependiendo si la variable PORT esta configurada
     * @return puerto por el cual correra el servicio
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
