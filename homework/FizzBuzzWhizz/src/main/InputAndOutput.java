import java.util.Scanner;
import java.util.*;

public class InputAndOutput {
    
    public String[] getInput(Input input) {
        String all = input.get();
        String[] elements= all.split("\\D");
        return elements;
    }

    public void printOutput(String s){
        System.out.println(s);
    }
}
