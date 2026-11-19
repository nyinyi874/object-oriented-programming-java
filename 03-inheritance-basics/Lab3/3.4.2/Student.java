class Student extends Person {
    private String id;
    
    Student(){
        super(0);
        //this("Unknown",0);
    }
    
    Student(String name, int age){
        super(name,age);
    }

    //@Override
    public void displayInfo() {                // chaining-friendly toString
        System.out.println("Student: " + name +", age "+ age + ", id " + id);
    }

}
