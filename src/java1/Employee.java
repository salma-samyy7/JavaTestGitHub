/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author Salma Samy
 */
public abstract class Employee extends Person {
    double salary;
    String job,rank;
    
    public Employee()
    {
        
    }
    public Employee(String n,double a,String na,String ad,double s,String j, String r )
    {
        super(n,a,na,ad);
        salary=s;
        job=j;
        rank=r;
                
    }

     public final void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
    public abstract double getSalary();

    public String getJob() {
        return job;
    }

    public String getRank() {
        return rank;
    }
    
    @Override
    public void print_details()
    {
        super.print_details();
        System.out.println("salary: "+salary+"job: "+job+"rank: "+rank);
    }
    
    
}
