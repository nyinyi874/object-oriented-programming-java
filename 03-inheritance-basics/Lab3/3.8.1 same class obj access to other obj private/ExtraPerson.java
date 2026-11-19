/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author woratatmakasiranondh
 */
import one.*;
import two.*;

public class ExtraPerson extends Student{
    public static void main(String arg[]){
        Student a = new Student();
        Student b = new Student();
        
        a.setStudentID("650AAAA");
        a.setAge(1);
        b.setStudentID("650BBBB");
        b.setAge(2);
        
        a.swappingStudentAge(a,b);
        b.swappingStudentId(a,b);      
        
        
        a.displayInfo();
        b.displayInfo();
    }
}
