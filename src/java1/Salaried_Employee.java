/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author Salma Samy
 */
public class Salaried_Employee extends Employee {
    double bonus,deduction;

    public Salaried_Employee() {
    }

    public Salaried_Employee(double bonus, double deduction, String n, double a, String na, String ad, double s, String j, String r) {
        super(n, a, na, ad, s, j, r);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeduction() {
        return deduction;
    }
    
   
    @Override
    public double getSalary()
    {
        return salary+bonus-deduction;
    }
    
    
    
}
