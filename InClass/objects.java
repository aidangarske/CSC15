public class objects {

    public static void main(String[] args) {
        // create user defined data type
        //attributes / parameters for class
        Student s1 = new Student("Alex", "12345", "CSC", 2020);
        // modify id number s1 object
        //s1.id = "12346"; // should not be able to change here
        // need to encapselate
        s1.setId("12345"); // have to have the object and then what to modify

        // calling static method
        Student.print(); // need to supply the class id and method name static

        Student s2 = new Student("Aidan", "12345", "CSC", 2020);

        // System.out.println(s1.name); // has private access need
        // call getter methods
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getMajor());
        System.out.println(s1.getYear());

        System.out.println(s1); // shows adress of object
        System.out.println(s1.toString()); // these are same when have toString method
    }
}