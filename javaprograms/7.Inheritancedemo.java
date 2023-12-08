7.Demonstrate types of inheritance
class Animal {
    String name :
    public void cat() {
           System.out.println("this is parent class");
//parent class
      }
}
class Dog extends Animal {
 	public void display() {
              System.out.println("this child class");
         }
}
 class Main{
     public static void main(String[] args) {
        // creating object for child class
          Dog obj = new Dog();
           obj.name = "naresh";
            obj.display();
       // calling parent class method with child class object reference
            obj.cat();
}
}
 output:
 this is child class
this is parent class

