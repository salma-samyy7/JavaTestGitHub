/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author Salma Samy
 */
public class Cellphone {
    private String manufact,model;
    private double retailPrice;
    
    public Cellphone(String m,String mo) {
        manufact =m;
        model=mo;
        
}
    
     public Cellphone(String m,String mo,double p) {
        this(m,mo);
        retailPrice=p;
        
}
    public void setmanu(String m){
        if("iphone".equals(m) || "samsumg".equals(m))
            manufact=m;
        else
            System.out.println("wrong manufacture");
}
     public void setmodel(String m){
        
        model=m;
}
      public void setRetailprice(double p){
        if(p>0)
        retailPrice=p;
        else
            System.out.println("invaild RetailPrice");
}
        public String getmanu(){
        
      return  manufact;
}
          public String getmodel(){
        
      return  model;
}
            public double getRetailPrice(){
        
      return  retailPrice;
}
}
