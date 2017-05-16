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
public abstract class ShareAsset implements Asset {
    protected String symbol;
    protected double totalCost;
    protected double CurrentPrice;

    public ShareAsset(String symbol, double totalCost, double CurrentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.CurrentPrice = CurrentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return CurrentPrice;
    }

    public void setCurrentPrice(double CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }
    
    
    @Override
  //solo funciona si este es abstract?
    public abstract double getProfit();
    
}
