public class TestParameter{
    
    public static void setParameter1(int n){
        n=6;
        System.out.println(n);
    }

    public static void setParameter2(String s1){
        //s1="abc";
        System.out.println(s1);
    }
    
    public static void setParameter3(StringBuffer s2){
        //StringBuffer s2=new StringBuffer("heihei");
        s2.append("haha");
    }
    
    public static void main(String[] args){
        int a=3;
        TestParameter.setParameter1(a);
        System.out.println("a="+a);
        
        String b=new String("bcd");
        TestParameter.setParameter2(b);
        System.out.println("b="+b);

        StringBuffer c=new StringBuffer("hehe");
        TestParameter.setParameter3(c);
        System.out.println("c="+c);
    }    
}

