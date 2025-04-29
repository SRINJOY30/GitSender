public class StuMain {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student();
        
        // Properties of the student
        student.setName("Srinjoy Biswas");
        student.setAge(20);
        student.setGrade("A");
        
        // Get and print the properties of the student
        System.out.println("Student Details:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Grade: " + student.getGrade());
    }
    
}
