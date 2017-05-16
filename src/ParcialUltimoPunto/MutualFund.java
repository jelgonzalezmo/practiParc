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
public class MutualFund extends ShareAsset{
    protected double totalShares;

    public MutualFund(double totalShares, String symbol, double totalCost, double CurrentPrice) {
        super(symbol, totalCost, CurrentPrice);
        this.totalShares = totalShares;
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }
    
    public double getMarketValue(){
     double valor=totalShares*super.CurrentPrice;
    return valor; };
    public double getProfit(){
    double beneficio=((totalShares*super.CurrentPrice)-super.totalCost);
    return beneficio;
    };
}
