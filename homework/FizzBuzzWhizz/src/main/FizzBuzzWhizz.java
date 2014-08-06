public class FizzBuzzWhizz {

    public static void main(String[] args){
        InputAndOutput inputAndOutput = new InputAndOutput();
        

        Checker checker = new Checker("");
        
        while (!checker.check()) {
            System.out.println("Please input special numbers which should be three different digits:");
            checker = new Checker(inputAndOutput.getInput(new SystemInput()));
        } 
        
        Changer changer = new Changer(checker.convertedElements);
        for (int testNumber=1;testNumber<101;testNumber++) { 
            inputAndOutput.printOutput(changer.change(testNumber));
        }
    }
}
