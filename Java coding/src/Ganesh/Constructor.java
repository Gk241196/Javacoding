package Ganesh;
//parameterized constructor
public class Constructor 
{
   String animal_name;
   String animal_type;
public Constructor(String name,String type)
{
      this.animal_name=name;
      this.animal_type=type;
}

public void aboutanimal()
{
	System.out.println("Animal name is "+animal_name+ " and type is "+animal_type);
}
public static void main(String args[])
{
	Constructor obj1=new Constructor("Ganesh", "lion");
	obj1.aboutanimal();
	Constructor obj2=new Constructor("babu", "dog");
	obj2.aboutanimal();	
}
}
