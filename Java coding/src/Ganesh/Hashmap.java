package Ganesh;
import java.util.HashMap;
public class Hashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("24","Ganesh");
		obj.put("08","Moni");
		//obj.put("11","Love");
		System.out.println("values are" +obj);
		int obj2=obj.size();
		System.out.println("Size of an hash map "+obj2);
		String value =obj.get("08");
		System.out.println("using get key" +value);
	}
}
