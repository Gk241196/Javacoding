package JavaconceptsExamples;
public class Variables { 
	    int data = 50; // instance variable  
	    static int m = 100; // static variable  
	    void method() {  
	        int n = 90; // local variable  
	        System.out.println("Local variable n: " + n);  
	    }    
	public static void main(String[] args) {
		// Access and print instance variable
       Variables obj = new Variables();    
        System.out.println("Instance variable data: " + obj.data);  
        // Access and print static variable
        System.out.println("Static variable m: " + Variables.m);  
        // Call method to print local variable
        obj.method();  
    }  
		
		
	}


