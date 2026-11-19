class Student extends Person {
    private String id;
    
    public Student(){
        super();
    }
    

    //@Override
    public void displayInfo() {                // chaining-friendly toString
        System.out.println("Student: " + name +", age "+ age + ", id " + id);
    }

}
