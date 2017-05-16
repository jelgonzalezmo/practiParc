/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialUltimoPunto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeisson
 */
public class Main {

    public static String desencriptar(String s) {
        char scc[] = s.toCharArray();
        for (int i = 0; i < scc.length; i++) {
            if (scc[i] - 65 >= 7) {
                scc[i] = (char) ((((int) scc[i] - 65 - 7) % 26) + 65);
            } else {
                scc[i] = (char) ((((int) scc[i] + 26 - 65 - 7) % 26) + 65);
            }
        }

        return new String(scc);
    }

    public static void main(String[] args) throws FileNotFoundException {

        int cnt = 0;

        Scanner s = new Scanner(new File("datos_2.txt"));
        ArrayList<Cash> sa = new ArrayList<>();
        ArrayList<Stock> ss = new ArrayList<>();
        ArrayList<DividentStock> ds = new ArrayList<>();
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String datos[] = line.split(",");

            cnt++;

            switch (desencriptar(datos[0])) {
                case "CASH":
                    Cash j = new Cash(Double.parseDouble(datos[1]));
                    sa.add(j);
                    j.listar(desencriptar(datos[0]));
                    System.out.println("total valor en el mercado= " + j.getMarketValue());
                     System.out.println("total beneficio= " + j.getProfit());
                    break;
                case "STOCK":
                    Stock k = new Stock(
                            desencriptar(datos[1]),
                            Double.parseDouble(datos[2]),
                            Double.parseDouble(datos[3]),
                            Integer.parseInt(datos[4]));
                    ss.add(k);
                    k.listar(desencriptar(datos[0]), desencriptar(datos[1]));
                    if (desencriptar(datos[1]).equalsIgnoreCase("GOOGLE") || desencriptar(datos[1]).equalsIgnoreCase("SAMSUMG")) {
                        System.out.println("total valor en el mercado= " + k.getMarketValue());
                    }
                     System.out.println("total valor en el mercado= " + k.getMarketValue());
                     System.out.println("total beneficio= " + k.getProfit());
                    break;
                case "DIVSTOCK":
                    DividentStock l = new DividentStock(
                            desencriptar(datos[1]),
                            Double.parseDouble(datos[2]),
                            Double.parseDouble(datos[3]),
                            Integer.parseInt(datos[4]),
                            Double.parseDouble(datos[5]));
                    ds.add(l);
                    l.listar(desencriptar(datos[0]), desencriptar(datos[1]));
                    if (desencriptar(datos[1]).equalsIgnoreCase("GOOGLE") || desencriptar(datos[1]).equalsIgnoreCase("SAMSUMG")){
                        System.out.println("total valor en el mercado= " + l.getMarketValue());
                    }
                    System.out.println("total valor en el mercado= " + l.getMarketValue());
                     System.out.println("total beneficio= " + l.getProfit());
                    break;

            }
           
        }

    }

}
