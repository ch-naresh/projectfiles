6.Demonstrate the Classes, Objects, and Constructors
package pack1;

public class Classdemo {

	public static void main(String[] args) {
		 
			int age;
			String name;
			// constructor with parameters
			 public Classdemo(int age,String name)
			{
				this.age=age;
				this.name = name;
			}
			//object creation by initializing constructor
			Classdemo obj1 =new Classdemo(naresh, 25);
			Classdemo obj2 = new Classdemo(raju, 20);
			System.out.println("name and age  of person 1",+obj1.name,+obj1.age);
			System.out.println("name and age of person2 ",+obj2.name,obj2.age);
			

	}

}
