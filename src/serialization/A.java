package serialization ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


 class A implements Serializable{
	 public String a="Ram";
	 public int b= 10;
	 
	 public A(String a, int b) {
		 this.a=a;
		 this.b=b;
		
	}



	 
	 class B{
		 
		 public static void main(String []args) {
			 
			 A object = new A("swarnendu",1);
			 String filename = "file.ser";
			 
			try {
				 FileOutputStream fos = new FileOutputStream(filename);
				 ObjectOutputStream oos = new ObjectOutputStream(fos);
				 
				 
				 oos.writeObject(oos);
				 fos.close();
				 oos.close();
		            System.out.println("Object has been serialized");

				
			} catch (IOException e) {
				System.out.println(e);
			}
			 
			 
		 }
		 
	 }
	
	

}
