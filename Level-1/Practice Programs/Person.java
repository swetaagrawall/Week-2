import java.util.Scanner;

class Person{
    private String name;
	private int age;
	private String gender;
    public Person(String name ,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public Person(Person previousPerson){
		this.name=previousPerson.name;
		this.age=previousPerson.age;
		this.gender=previousPerson.gender;
		
	}
	
	public void display(){
		System.out.println("The Name of person is " +name);
		System.out.println("The age of person is " +age);
		System.out.println("The gender of person is " +gender);
    }


    public static void main(String[] args) {
         Person person = new Person("Sweta Agrawal" , 22 , "Female");
         person.display();
		 Person previousPerson = new Person(person);
         previousPerson.display();
		 
         
        
     }
  }
  