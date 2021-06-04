package prolim.phase1.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializationDeserializationExample {

	public static void main(String[] args) throws IOException{
		
		Student obj = new Student(101,25,"John", "Delhi");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("Student.ser");   // can specify full path to a location as well
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("Serialization done");
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		finally {
			oos.close();
			fos.close();
		}
       
		
		// Deserialization
		Student o = null;
		try {
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ois.close();
			fis.close();
		}catch(IOException ioe) {
			//System.out.println(ioe);
			ioe.printStackTrace();
			return;
		}
	//	catch(ClassNotFoundException cnfe) {
	//		System.out.println("Student not found");
	//		cnfe.printStackTrace();
	//		return;
	//	}
		
		System.out.println("Student Name :"+obj.getName());
		System.out.println("Student age :"+obj.getAge());
		System.out.println("Student Roll No. :"+obj.getRoll());
		System.out.println("Student Address :"+obj.getAddress());
		
		
	}

}

class Student implements java.io.Serializable{
	private String name;
	private int age;
	private String address;
	private int roll;
	
	Student(){}
	
	Student(int r, int a, String name, String add){
		this.name = name;
		age = a;
		roll = r;
		address = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
}
