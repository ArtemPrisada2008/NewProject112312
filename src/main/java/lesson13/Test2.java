package lesson13;

public class Test2 {
    void speak(){
        System.out.println("Talking.......");
    }
    void run(){
        System.out.println("Runing.....");
    }
    void eat(){
        System.out.println("Eating.....");
    }
    void speak(int age){
        System.out.println("Talking........");
    }
    void run(int speed){
        System.out.println("Runing.......");
    }
    void eat(int age){
        System.out.println("Eating.......");
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.speak();
        test2.eat();
        test2.run();
    }
}
