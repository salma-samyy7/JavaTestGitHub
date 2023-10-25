/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author Salma Samy
 */
public class Rectangle {
    private double length,width;
    
    public Rectangle(double l,double w)
    {
        length=l;
        width=w;
    }
    public Rectangle addrec(Rectangle r1)
    {
        Rectangle r2 = new Rectangle(0,0);
        r2.length=this.length+r1.length;
        r2.width=this.width+r1.width;
        return r2;
        
    }
      public void setlength(double l)
      {
       length=l;   
      }
      public void setwidth(double w)
      {
       width=w;  
      }
      public double getlength()
      {
          return length;
      }
      public double getwidth()
      {
          return width;
      }
      public double getarea()
      {
          return width*length;
      }
      

    
    
    
    
    
}
