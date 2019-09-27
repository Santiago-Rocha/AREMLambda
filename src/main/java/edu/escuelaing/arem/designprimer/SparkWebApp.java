
package edu.escuelaing.arem.designprimer;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import spark.QueryParamsMap;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");

        post("/square", (req, res) -> {
            QueryParamsMap map = req.queryMap();
            String[] nums = map.get("numbers").value().split("\n");
            String urlString  = "https://6xqkagntk7.execute-api.us-east-1.amazonaws.com/betarem?value="+nums[0];
            URL url = new URL(urlString);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String ans = br.readLine();
            return ans;
        });

    }

    /**
     * Metodo que asigna el puerto por el cual correr dependiendo si la variable
     * PORT esta configurada
     * 
     * @return puerto por el cual correra el servicio
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set (i.e. on localhost)
    }
}