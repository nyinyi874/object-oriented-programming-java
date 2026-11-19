/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
class BicycleRegistration {
    public static void main(String[] args){
        Bicycle bike1, bike2;
        String owner1, owner2;
        
        bike1 = new Bicycle("Adam Smith");
        
        bike2 = new Bicycle( ); //Create and assign values to bike2       
	    bike2.setOwnerName("Ben Jones");
               
        
        //Output the information
        
        //private
        owner1 = bike1.getOwnerName( );
        owner2 = bike2.getOwnerName( );
        
        //public
        //owner1 = bike1.ownerName;
        //owner2 = bike2.ownerName;
        
        
        System.out.println(owner1 + " owns a bicycle.");
        System.out.println(owner2 + " also owns a bicycle.");
    }
    
}
