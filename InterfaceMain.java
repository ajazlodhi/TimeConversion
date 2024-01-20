
interface MYANIMAL {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
class MYDog implements MYANIMAL {
        public void animalSound() {
            System.out.println("The Dog says: BHow BHow");
        }
        public void sleep() {
            System.out.println("burrrr");
        }
    }

    class InterfaceMain {
        public static void main(String[] args) {
            MYDog myDog = new MYDog();
            myDog.animalSound();
            myDog.sleep();
        }
    }


