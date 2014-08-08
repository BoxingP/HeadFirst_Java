import java.util.Scanner;
import java.util.*;

public class InputAndOutput {
    
    public String getInput() {
        Scanner scanner =new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printOutput(String result){
        System.out.println(result);
    }
}
