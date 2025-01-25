package inheritance.assistedproblems.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a= new Animal("Animal" , 10);
        a.display();
        a.makeSound();
        a= new Dog("Doggy" , 15);
        a.display();
        a.makeSound();
        a= new Cat("Kitty" , 8);
        a.display();
        a.makeSound();
        a= new Bird("Peacock", 15);
        a.display();
        a.makeSound();


    }
}
