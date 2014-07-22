public class Dog extends Animal{

    
    public void makeNoise(int n){
        super.makeNoise(4);
        System.out.println(n+"WangWangWang");
    }

    public void color(String s){
        
        this.makeNoise(5);   
        System.out.println("Dog is colorful.");
    }
    public void color(int s){
        System.out.println("Dog is beautiful.");
    }
    private void color(double s, float t){
        
    }
}
