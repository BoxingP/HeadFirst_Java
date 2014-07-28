import java.util.*;

public class Input{
   int[] getUserinput(){
       System.out.println("Enter three numbers");
       Scanner s=new Scanner(System.in); 
       String[] num=s.nextLine().split("\\D");
       int[] number=new int[3];
       for(int i=0;i<3;i++){
           number[i]=Integer.valueOf(num[i]);
       }
   return number;
   }
} 
