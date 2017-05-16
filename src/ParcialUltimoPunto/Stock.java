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
public class Stock extends ShareAsset{
    protected int totalShares;

    public Stock(String symbol, double totalCost, double CurrentPrice,int totalShares) {
        super(symbol, totalCost, CurrentPrice);
        this.totalShares=totalShares;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue(){
    double valor=totalShares*super.CurrentPrice;
    return valor; 
    };
    @Override
    public double getProfit(){
     double beneficio=((totalShares*super.CurrentPrice)-super.totalCost);
    return beneficio;
    };
    
    public void listar(String s,String g){
       System.out.println(s +","+g +" ,"+ super.totalCost+ ", "+
       super.CurrentPrice+" ,"+ totalShares);
   }
    
    
    
    }
