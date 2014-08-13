public class FizzBuzzWhizzMurmur {
    public static void main(String[] args) {
        InputAndOutput inputAndOutput = new InputAndOutput();
        
        if (args.length==0) {
            System.out.println("Please input four different digits:");
            String keyboardInput = inputAndOutput.getInput();
            args=new String[] {keyboardInput};
        }

        int[] specialNumber = new Converter(args[0]).convert();
        if (!new Checker(specialNumber).check()) { return; }
        
        for (int testNumber=1;testNumber<101;testNumber++) {
            String result = new Changer(specialNumber).change(testNumber);
            inputAndOutput.printOutput(result);
        }
    }
}
