/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class Account {
    // Data Members
    private static final double FEE = 0.50;
    
    private String ownerName;
    private double balance;
    
    //Constructor
    public Account( ) {
        ownerName = "Unassigned";
        balance = 0.0;
    }
    
    //Adds the passed amount to the balance
    public void add(double amt) {
        balance = balance + amt;
    }
    //Deducts the passed amount from the balance
    public void deduct(double amt) {
        balance = balance - amt - FEE;
    }
    
    
    //Returns the current balance of this account
    public double getCurrentBalance( ) {
        return balance;
    }
    //Returns the name of this account's owner
    public String getOwnerName( ) {
        return ownerName;
    }
    
    
    //Sets the initial balance of this account
    public void setInitialBalance(double bal) {
        balance = bal;
    }
    //Assigns the name of this account's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }
}
