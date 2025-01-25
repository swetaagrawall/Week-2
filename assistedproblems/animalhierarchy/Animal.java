package inheritance.assistedproblems.animalhierarchy;

public class Animal {
        private String name;
        private int age;
        Animal(String name , int age){
            this.name=name;
            this.age=age;
        }
        public void makeSound(){
            System.out.println("Animal Sound");
        }
        public void display(){
            System.out.println("The name is "+ name+" and the age is "+age);
        }
    }

