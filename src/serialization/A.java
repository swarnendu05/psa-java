package serialization ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
			
			
			
			
			// deserialization
			A object1=null;
			
			 try
		        {   
		            // Reading the object from a file
		            FileInputStream file = new FileInputStream(filename);
		            ObjectInputStream in = new ObjectInputStream(file);
		             
		            // Method for deserialization of object
		            
		            try {
						object1 = (A)in.readObject();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		             
		            in.close();
		            file.close();
		             
		            System.out.println("Object has been deserialized ");
		            System.out.println("a = " + object1.a);
		            System.out.println("b = " + object1.b);
		        }
		         
		        catch(IOException ex)
		        {
		            System.out.println("IOException is caught");
		        }

			 
			 
		 }
		 
	 }
	
	

}
