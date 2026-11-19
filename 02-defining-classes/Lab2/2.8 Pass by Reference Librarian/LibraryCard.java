/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class LibraryCard {
    
    // Data Members
    //student owner of this card
    private Student owner;
    //number of books borrowed
    private int borrowCnt;
    private NumberOfBook borrowCntNumberOfBook;
    
    //Constructor
    public LibraryCard( ) {
        owner = null;
        borrowCnt = 0;
        borrowCntNumberOfBook = new NumberOfBook();
    }
    
    
    //numOfBooks are checked out
    public void checkOut(int numOfBooks) {
        borrowCnt = borrowCnt + numOfBooks;
    }

    public void checkOut(NumberOfBook numOfBooks){
        borrowCntNumberOfBook = numOfBooks;
        this.checkOut(borrowCntNumberOfBook.checkOutNumber);
    }
    
    //Returns the number of books borrowed
    public int getNumberOfBooks( ) {
        //return borrowCnt;
        return borrowCntNumberOfBook.checkOutNumber; //return as pass by reference
    }
        
    //Returns the name of the owner of this card
    public String getOwnerName( ) {
        return owner.getName( );
    }
    
    //Sets owner of this card to student
    public void setOwner(Student student) {
        owner = student;
    }
    
    //Returns the string representation of this card
    public String toString( ) {
        return "Owner Name: " + owner.getName( ) + "\n" +
        " Email: " + owner.getEmail( ) + "\n" +
        "Books Borrowed by Object: " + this.getNumberOfBooks()+"\n"+
        "Books Borrowed by primitive: " + borrowCnt;
    }
    
    
    
}
