public class FizzBuzzWhizz {

    public static void main(String[] args){
        InputAndOutput io = new InputAndOutput();
        System.out.println("Please input three different numbers:");
        String[] specialNumber = io.getInput(new SystemInput());
        
        NumberChecker numberChecker = new NumberChecker(specialNumber);
        while (!numberChecker.check()) {
            System.out.println("Please reinput:");
            specialNumber = io.getInput(new SystemInput());
        } 
        
        NumberChanger numberChanger = new NumberChanger(specialNumber);
        for (int i=1;i<101;i++) { 
            String s = numberChanger.change(i);
            io.printOutput(s);
        }
    }
}
