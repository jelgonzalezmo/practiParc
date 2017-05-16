/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialUltimoPunto;

/**
 *
 * @author jeisson
 */
public class Cash implements Asset {
    protected double amoun;

    public Cash(double amoun) {
        this.amoun = amoun;
    }

    public double getAmoun() {
        return amoun;
    }

    public void setAmoun(double amoun) {
        this.amoun = amoun;
    }
    
    
    public double getMarketValue(){
    double valor=amoun;
    return valor;
    };
    public double getProfit(){
    double beneficio=0;
    return beneficio;
    };
    
    public void listar(String s){
        System.out.println(s+", "+amoun);
    
    }
    
}
