import java.util.*;

public class SystemInput implements Input{
    private String input;

    public String get() {
        Scanner sc =new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }
}


