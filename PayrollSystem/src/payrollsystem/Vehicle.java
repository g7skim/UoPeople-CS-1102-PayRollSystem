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

// Define the Vehicle
public class Vehicle {
    private String plateNumber;
    private String colour;
    
    public Vehicle (String plateNumber, String colour){
        this.plateNumber = plateNumber;
        this.colour = colour;
    }

    /**
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
