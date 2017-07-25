/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
public class FullTime extends Employee {
    private double salary;
    private double overtime;
    
    // Define the Fullime class constructor
    public FullTime (int id, String name, double sal,
                     double hourAndHalf, Vehicle vehicle) {
        super  (id, name, vehicle);
        this.overtime = hourAndHalf;
        this.salary = sal;
    }
    
    // Define calculatePay() method from the Employee.java
    public double calculatePay() {
        System.out.println("Full time employee.");
        return (this.getSalary() + this.getOvertime());
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the overtime
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * @param overtime the overtime to set
     */
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
