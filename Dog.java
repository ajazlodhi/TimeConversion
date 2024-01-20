public class Dog extends Animal{
    private String breed;
    public Dog(String name,int age,String color, String breed){
        super(name,age,color);
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Dog is barking ....");
        if (name == "Buddy"){
            System.out.println("Dog breed is Labrador");

        }
    }
    public void fetch(){
        System.out.println("Dog is Fetching ...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bread : "+this.breed);
    }
}
