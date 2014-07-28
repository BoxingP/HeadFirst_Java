import java.util.*;

public class FizzBuzzWhizz {
    
    Input input=new Input();
    int[] inputNumber=input.getUserinput();


    void changeNumber(){
        System.out.println("Count off!");
        int n1=inputNumber[0];
        int n2=inputNumber[1];
        int n3=inputNumber[2];
        String result;
        for(int i=1;i<101;i++){
            if (Integer.toString(i).matches("^.*"+Integer.toString(n1)+".*$")){
               result="Fizz";
            }
            else if ((i%n1==0)&(i%n2==0)&(i%n3==0)){
               result="FizzBuzzWhizz";
            }
            else if ((i%n1==0)&(i%n2==0)){
               result="FizzBuzz";
            }
            else if ((i%n1==0)&(i%n3==0)){
               result="FizzBuzz";
            }
            else if ((i%n2==0)&(i%n3==0)){
               result="BuzzWhizz";
            }
            else if (i%n1==0){
                result="Fizz";
            }
            else if (i%n2==0){
                result="Buzz";
            }
            else if (i%n3==0){
                result="Whizz";
            }
            else {
               result=Integer.toString(i);
            }
           System.out.println(result); 
        }
    }

}
