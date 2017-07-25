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
public class PartTime extends Employee {
    private double rate;
    private double hoursWorked;
    
    // Define the PartTime class constructor
    public PartTime (int id, String name, double rate,
                     double hoursWorked2, Vehicle v1) {
        super (id, name, v1);
        this.rate = rate;
        this.hoursWorked = hoursWorked2;
    }
    public double calculatePay() {
        
        System.out.println("Part time employee.");
        return (this.getHoursWorked() * this.getRate());
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
}
