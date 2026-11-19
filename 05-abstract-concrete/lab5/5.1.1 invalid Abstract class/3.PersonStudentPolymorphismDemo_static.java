/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
// PersonStudentPolymorphismDemo.java
// Compile & run:
//   javac PersonStudentPolymorphismDemo.java && java PersonStudentPolymorphismDemo


abstract class Student{//abstract class contain abstract method
    protected final static int NUM_OF_TESTS = 3;
    protected String name;
    protected final String studentId;
    protected String courseGrade;
    protected int[] test;

    public Student(){
        this.name = "default";
        this.studentId = "000000";
    }
    
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        test = new int[NUM_OF_TESTS];
        courseGrade = "****";
    }
    
    abstract static void computeCourseGrade();//Abstract method has no body
    
    public String getCourseGrade(){
        return courseGrade;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTestScore(int testNumber){
        return test[testNumber - 1];
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setTestScore(int testNumber, int testScore){
        test[testNumber -1] = testScore;
    }
    


    public String role() { return "Student"; }

    public String level() { return "General"; } // overridden in subclasses


    public void introduce() {
        //super.introduce(); // prints "Hi, I'm ... (role)"
        System.out.println("Hi, I'm " + name + " (" + role() + ")");
        System.out.println("ID: " + studentId + " • Level: " + level());
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(){
        
    }
    public GraduateStudent(String name, String studentId) {
        super(name, studentId);
    }
    @Override public String role()  { return "Graduate Student"; }
    @Override public String level() { return "Graduate"; }
    
    @Override
    public void computeCourseGrade(){
        
    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(){
        
    }
    public UndergraduateStudent(String name, String studentId) {
        super(name, studentId);
    }
    @Override public String role()  { return "Undergraduate Student"; }
    @Override public String level() { return "Undergraduate"; }
    
    @Override
    public void computeCourseGrade(){
        
    }
}

public class PersonStudentPolymorphismDemo {
    

    public static void main(String[] args) {
        //Student s1 = new Student();//abstract class now cannot instantiate
        Student s2 = new GraduateStudent();
        Student s3 = new UndergraduateStudent();
        
        //GraduateStudent s4 = new Student();
        //UndergraduateStudent s5 = new GraduateStudent();
        
        
        s2.introduce();
        s3.introduce();
        
      
    }
}

