public class Student {
    // 1. list attribute name, major, id, year
    // make private to hid varaible
    private String name;
    private String id;
    private String major;
    private int year;

    // constructor has same name as class and no ret type
    /*public Student(String n, String I, String m, int y) {
        name = n;
        id = I;
        major = m;
        year = y;
    }*/

    public Student(String name, String id, String major, int year) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.year = year;
    }

    //static method user defined data type
    public static void print() {
        System.out.println("helloworld");
    }

    //setter mutator methods
    // always start set and new
    //allow you to modify the instance varaibles
    public void setName(String newName) {
        name = newName;
    }
    public void setId(String newId) {
        id = newId;
    }
    public void setMajor(String newMajor) {
        major = newMajor;
    }
    public void setYear(int newYear) {
        year = newYear;
    }

    //getter methods returns instance varaible
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getMajor() {
        return major;
    }
    public int getYear() {
        return year;
    }

    //tostring method
    // creates a string representing each student
    public String toString() {
        String s = "";
        s = "Name: " + name;
        s = s + "\nID: " + id;
        s = s + "\nmajor: " + major;
        s = s + "\nYear: " + year;
        return s;
    }
}