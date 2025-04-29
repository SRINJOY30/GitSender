class Animal {
    @SuppressWarnings("unused")
    void makeSound() { // Abstract method
        System.out.println("Animal makes sound");
    } 

}
class Cat extends Animal {
    @Override
    void makeSound() { // Implementing the abstract method
        System.out.println("Cat barks");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound(); // Calls the implemented method
    }
}