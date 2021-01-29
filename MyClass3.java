// class name must be same as file name!
// each file can only have one public class

public class MyClass3 {
    public static void main(String[] args) {
        Student Jackson = new Student("Jim Jackson", 20, 180.5, 99.9, true);  // create a class instance
        Jackson.PrintName();  // call the class method
        System.out.println("The age is " + Jackson.PrintAge());  // print the return value
        Student.Greet();
    }
}

// Object-Oriented Programming
// define a class

class Student {
    // class attributes/properties
    String name;
    int age;
    double height;  // in Java, we prefer double over float.
    double score;
    boolean isMale;

    // Build a constructor
    Student(String name, int age, double height, double score, boolean isMale) {
        // 'this' keyword is analogous to 'self'
        this.name = name;
        this.age = age;
        this.height = height;
        this.score = score;
        this.isMale = isMale;
    }

    // Create a class method
    void PrintName() {
        System.out.println("The student's name is " + name + ".");
    }

    // Another class method
    int PrintAge() {
        return this.age;
    }

    // A *static* method only associated with the class, not with any class instances
    // hence can access this method without relating to any instances
    static void Greet() {
        System.out.println("Hi everyone!");
    }
}
