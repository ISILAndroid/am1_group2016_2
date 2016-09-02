//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
   	Person person= new Person("Eduardo", "Medina", "40898479",34);
    person.printPerson();
  }
}

// you can add other public classes to this editor in any order
public class Person
{
  private final int AGE_DEFAULT=18; 
  private String name;
  private String lastName;
  private String dni;
  private int age;
  
  public Person(){};
  
  public Person(String name, String lastName, String dni, int age){
    this.name= name;
    this.lastName= lastName;
    this.dni= dni;
    this.age= age;
  }
  
  public void setName(String name){
  	this.name= name;
  }
  
  public String getName(){
  	return this.name;
  }
    
  public void setLastName(String lastName){
  	this.lastName= lastName;
  }
  
  public String getLastName(){
  	return this.lastName;
  }
  
  public void setDNI(String dni){
  	this.dni= dni;
  }
  
  public String getDNI(){
  	return this.dni;
  }
  
  public void setAge(int age){
  	this.age= age;
  }
  
  public String getAge(){
  	return this.age;
  }
  
  public void printPerson() {
    System.out.println("name:" +
                       name + " lastName:" + 
                       lastName + " dni:" + dni +
                       " age "+ age);}

  
}
