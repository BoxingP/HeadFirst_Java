public class TestInheritance{

    public static void main(String[] args){
    Animal animal=new Animal();
    Dog dog=new Dog();

    //animal.forExample();
    dog.makeNoise(3);
    dog.color(45);
    System.out.println(dog.times);
    }
}
