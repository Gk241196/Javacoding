package Ganesh;

import java.util.ArrayList;

public class Collections 
{


		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			ArrayList obj=new ArrayList();
			obj.add("Ganesh");
			obj.add("automation");
			obj.add("kumar");
			
		   int arrsize=obj.size();
		

		for(int i=0;i<arrsize;i++)
		{
			System.out.println("Print the names " + obj.get(i));
			}

	}
}
