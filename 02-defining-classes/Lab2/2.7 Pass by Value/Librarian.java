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
        Student studentName;
        LibraryCard card1, card2;

        // Test variable Pass by value
        int checkOutNumber = 3;

        studentName = new Student();
        studentName.setName("Jon Java");
        studentName.setEmail("jj@javauniv.edu");

        card1 = new LibraryCard();
        card1.setOwner(studentName);
        card1.checkOut(checkOutNumber); // passing by value

        // Testing
        checkOutNumber = 4; // Newly assigned number
        System.out.println(checkOutNumber);

        card2 = new LibraryCard();
        card2.setOwner(studentName); // the same student is the owner of the second card, too

        System.out.println("Card1 Info:");
        System.out.println(card1.toString() + "\n");
        System.out.println("Card2 Info:");
        System.out.println(card2.toString() + "\n");
    }

}
