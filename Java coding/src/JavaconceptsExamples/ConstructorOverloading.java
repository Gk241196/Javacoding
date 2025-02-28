package JavaconceptsExamples;
public class ConstructorOverloading {
    static String name2;   // Class-level variable
    ConstructorOverloading() {   // Default constructor
        System.out.println("His first name is Ganesh");
    }
    ConstructorOverloading(String name) { // Overloaded constructor with a parameter
        // Use the parameter value instead of reassigning inside the constructor
        System.out.println("His last name is " + name);
    }
    public static void main(String[] args) {  
    ConstructorOverloading obj1 = new ConstructorOverloading(); // Creating object using the default constructor
    ConstructorOverloading obj2 = new ConstructorOverloading("Kumar"); // Creating object using the overloaded constructor
    }
}
