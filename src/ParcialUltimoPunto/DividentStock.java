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
public class DividentStock extends Stock {
    protected double dividens;
        public DividentStock( String symbol, double totalCost, double CurrentPrice, int totalShares,double dividens) {
        super(symbol, totalCost, CurrentPrice, totalShares);
        this.dividens = dividens;
    }

    public double getDividens() {
        return dividens;
    }

    public void setDividens(double dividens) {
        this.dividens = dividens;
    }
    
        
    @Override
   public double getMarketValue(){
   double valor=CurrentPrice+dividens;
   return valor;
   };
    public double getProfit(){
    double beneficio=((super.totalShares*super.CurrentPrice)-super.totalCost);
    return beneficio;
        }; 

   public void listar(String s,String g){
       System.out.println(s+", "+g +" ,"+ super.totalCost+ ", "+
       super.CurrentPrice+", "+ super.totalShares+", "+dividens);
   }
    
}
