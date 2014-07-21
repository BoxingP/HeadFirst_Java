public class TestEquals{
    public static void main (String[] args){
        int number1=678;
        int number2=678;
        int number3=number1;

        System.out.println("number1="+number1+","+"number2="+number2+","+"number3="+number3);
        System.out.println("number1==number2?"+(number1==number2));
        System.out.println("number1==number3?"+(number1==number3));
        System.out.println("number2==number3?"+(number2==number3));

        //System.out.println("number1.equals(number2)?"+(number1.equals(number2)));
        //System.out.println("number1.equals(number3)?"+(number1.equals(number3)));
        //System.out.println("number2.equals(number3)?"+(number2.equals(number3)));
    
        A a1=new A();
        A a2=new A();
        A a3=a1;
        System.out.println("a1==a2?"+(a1==a2));
        System.out.println("a1.equals(a2)?"+(a1.equals(a2)));       
        System.out.println("a1==a3?"+(a1==a3));
        System.out.println("a1.equals(a3)?"+(a1.equals(a3)));
        System.out.println("a1.getS1()==a2.getS1()?"+(a1.getS1()==a2.getS1()));
        System.out.println("a1.getS1().equals(a2.getS1())?"+(a1.getS1().equals(a2.getS1())));
        System.out.println("a1.getS2()==a2.getS2()?"+(a1.getS2()==a2.getS2()));
        System.out.println("a1.getS2().equals(a2.getS2())?"+(a1.getS2().equals(a2.getS2())));


        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        String s4=new String("abc");
        System.out.println("s1==s2?"+(s1==s2));
        System.out.println("s1.equals(s2)?"+(s1.equals(s2)));
        System.out.println("s1==s3?"+(s1==s3));
        System.out.println("s1.equals(s3)?"+(s1.equals(s3)));
        System.out.println("s3==s4?"+(s3==s4));
        System.out.println("s3.equals(s4)?"+(s3.equals(s4)));

    }
}
