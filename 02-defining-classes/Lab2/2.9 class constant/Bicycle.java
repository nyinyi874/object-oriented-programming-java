/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class Bicycle {
    // Data Member
    String ownerName; // private property
    // String ownerName; //public property

    // Constructor: Initialzes the data member
    public Bicycle() {
        ownerName = "Unknown";
    }

    public Bicycle(String inputVar) {
        // ownerName = inputVar;
        this.setOwnerName(inputVar);
    }

    // Returns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }

    // Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }
}
