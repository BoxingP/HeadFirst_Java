public class TestPolymorphism{
    public static void main(String[] args){

        Shape one=new Shape();
        Polygon two=new Polygon();
        Square three=new Square();


        Monster m=new Monster();
        m.eat(one);
        m.eat(two);
        m.eat(three);

    }
}
