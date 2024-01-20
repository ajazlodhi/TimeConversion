public class Animal {
    protected String name;
    private int age;
    private String color;
    public Animal(){

    }
    public Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void eat(){
        System.out.println("Animal is Eating");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping");
    }
    public void printInfo(){
        System.out.println("Name :"+this.name +
                "\nAge "+this.age +
                "\nColor "+this.color);
    }
}
