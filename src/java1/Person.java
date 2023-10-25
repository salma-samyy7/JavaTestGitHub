/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author Salma Samy
 */
public class Person {

    protected String name, nationality,adress;
   private double age;
    
    public Person()
    {
    }
    
    public Person(String n,double a,String na,String ad )
    {
        name=n;
        age=a;
        nationality=na;
        adress=ad;
    }
    public void setname(String n)
    {
        name=n;
    }
      public void setnationality(String n)
    {
        nationality=n;
    }
        public void setadress(String a)
    {
        adress=a;
    }
          public void setage(double a)
    {
        age=a;
    }
    public String getname()
    {
        return name;
    }
    public String getnationality()
    {
        return nationality;
    }
    public String getadress()
    {
        return adress;
    }
    public double getage()
    {
        return age;
    }
    public void print_details()
    {
        System.out.println("name: "+name+"/nage: "+age+"/nnationality: "+nationality+"/nadress"+adress);
    }
        
   
            
    
}
