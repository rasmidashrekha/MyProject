package Serialization_Deserialization;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

class Test implements Serializable
{
	int i=10,j=20;
	
}


public class SerializationDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		// TODO Auto-generated method stub
Test t1=new Test();
//serialization
FileOutputStream fos=new FileOutputStream("test.txt");//write our object in to memory
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(t1);
	
	try {
	//De-serialization
	FileInputStream fis=new FileInputStream("test.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Test t2=(Test)ois.readObject();
	System.out.println(t2.i+" "+t2.j);
	}catch(FileNotFoundException ex) {
		Logger.getLogger("File not found");
	}


	}
}
