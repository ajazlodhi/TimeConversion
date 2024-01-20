public class Cat extends Animal{
    private String voice;
    private boolean isIndoor;

    public Cat(String name, int age, String color, String voice,boolean isIndoor) {
        super(name, age, color);
        this.voice = voice;
        this.isIndoor = isIndoor;
    }
    public void purr(){
        System.out.println("Cat is Purring ");
    }
    public void scartch(){
        System.out.println("Cat is Scratching ...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Voice: " + this.voice + "\nIndoor: "+ this.isIndoor);
    }
}
