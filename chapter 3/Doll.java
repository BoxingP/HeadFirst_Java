public class Doll{
    private static int number=0;
    private int id=0;
    private String name=null;

    public Doll(String name){
        this.name=name;
        number++;
        id=number;
    }

    public void speak(String word){
        String showNumber="目前共有"+number+"娃娃！";
        String showId="我的ID是"+id;

        System.out.println(name+":"+showNumber);
        System.out.println(name+":"+showId);
        System.out.println(name+":"+word);
    }

    public static void main(String[] args){
        Doll doll1=new Doll("贝贝");
        Doll doll2=new Doll("晶晶");
        
        doll1.speak("大家好！");
        doll2.speak("大家好！");


        int month=1;
        month=month+10;
        month=(byte) (month+1);
        System.out.println(month);
        float s1=0;
        for (int i=0; i<26; i++)
            s1+=0.1F;
        System.out.println(s1);
        double s2=0;
        for (int i=0;i<26;i++)
            s2+=0.1;
        System.out.println(s2);
        double f1=0.0/0.0;
        double f2=1.0/0.0;
        //int f3=(int) (-1/0);
        //long f4= (1/0);
        float f5=(float) (1.0/0.0);
        System.out.println(f1);
        System.out.println(f2);
        //System.out.println(f3);
        //System.out.println(f4);
        System.out.println(f5);

    }
}

