/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author Salma Samy
 */
public class Student extends Person{
    private int study_level;
    private double gpa;
    private String specialzation;

    public Student() {
    }
    
     public Student (String n,double a,String na,String ad,int lvl,double g,String sp )
    {
      super(n,a,na,ad);
      study_level=lvl;
      gpa=g;
      specialzation=sp;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSpecialzation(String specialzation) {
        this.specialzation = specialzation;
    }

    public int getStudy_level() {
        return study_level;
    }

    public double getGpa() {
        return gpa;
    }

    public String getSpecialzation() {
        return specialzation;
    }
     
}
