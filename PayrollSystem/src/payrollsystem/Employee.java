/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author admin
 */
public class Employee {
    
    private int empId;
    private String name;
    private Vehicle Vehicle;

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
        return Vehicle;
    }

    /**
     * @param Vehicle the Vehicle to set
     */
    public void setVehicle(Vehicle Vehicle) {
        this.Vehicle = Vehicle;
    }
    
}
