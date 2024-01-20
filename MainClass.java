public class MainClass {
    public static void main(String[] args) {
        // Create an object of Animal Class and call its Methods
        Animal myAnimal = new Animal("Leo",4, "Brown");
        myAnimal.printInfo();
        myAnimal.eat();
        myAnimal.sleep();
        System.out.println("======");
        // Create an object of Dog Class and call its Methods
        Dog myDog = new Dog("Buddy",3,"Black","Labrador");
        myDog.bark();
        myDog.fetch();
        myDog.printInfo();
        System.out.println("++++++++++++");
        // Create an object of Cat Class and call its Methods
        Cat myCat = new Cat("Zukku",3,"White", "Meao", true);
        myCat.purr();
        myCat.scartch();
        myCat.printInfo();
    }
}
