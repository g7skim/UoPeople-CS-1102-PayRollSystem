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

public abstract class Employee {
    // Variables
    private int empId;
    private String name;
    private Vehicle vehicle;
    
    // Class constructor
    public Employee() {
        // Default constructor is a constructor with zero parameter
        System.out.println("... inside default constructor");
        empId = 0;
        name = "";
    }
    
    public Employee (int pEmpId, String pName, Vehicle pV) {
        // Non default constructor with at least 1 parameter
        System.out.println("... inside Employee non-default constructor");
        empId = pEmpId;
        name = pName;
        this.vehicle = pV;
    }
    
    public Employee (int pEmpId, String pName, String pPlate, String pColour) {
        // Non default constructor with at least 1 parameter
        System.out.println("... inside Employee non-default constructor");
        empId = pEmpId;
        name = pName;
        this.vehicle = new Vehicle(pPlate, pColour);
    }
    
    // Abstract method of the class: calculatePay() will be defined within FullTime and PartTime
    // as these both classes are subclasses of Employee abstract class.
    public abstract double calculatePay();
    
    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param Vehicle the Vehicle to set
     */
    public void setVehicle(Vehicle Vehicle) {
        this.vehicle = Vehicle;
    }
    
}
