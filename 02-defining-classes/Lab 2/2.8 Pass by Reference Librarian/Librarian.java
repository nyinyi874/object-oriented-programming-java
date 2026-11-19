/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class Librarian {
    public static void main(String[] args) {
        Student student;
        LibraryCard card1, card2;
        
        //Test variable Pass by value
        int checkOutNumber = 3;
        //Test variable Pass by Reference
        NumberOfBook myCheckOutNumber = new NumberOfBook();
        myCheckOutNumber.checkOutNumber=3;
        System.out.println("Now the checkout is "+myCheckOutNumber.checkOutNumber);
        
        
        student = new Student( );
        student.setName("Jon Java");
        student.setEmail("jj@javauniv.edu");
        
        card1 = new LibraryCard( );
        card1.setOwner(student);
        //card1.checkOut(checkOutNumber); //passing by value
        card1.checkOut(myCheckOutNumber); //passing by reference
        
        
        //Testing
        checkOutNumber = 4; //Newly assigned number
        System.out.println(checkOutNumber);
        myCheckOutNumber.checkOutNumber=6;
        System.out.println(myCheckOutNumber.checkOutNumber);
        
        card2 = new LibraryCard( );
        card2.setOwner(student); //the same student is the owner of the second card, too
        //card2.checkOut(myCheckOutNumber); //how will card2 value of Book Borrowed?
        
        System.out.println("Card1 Info:");
        System.out.println(card1.toString() + "\n");
        System.out.println("Card2 Info:");
        System.out.println(card2.toString() + "\n");
    }
    
}
