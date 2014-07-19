public class Shape {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    public void rotate() {
        System.out.println(name+" rotate");
    }
    public void playSound() {
        System.out.println("playSound");
    }
}
