public class DefineSpecialNumber {
    
    public final int[] defineSpecialNumber() {
        InputAndOutput inputAndOutput = new InputAndOutput();
        int[] specialNumber;
    
        while (true) {
            System.out.println("Please input special numbers which should be three different digits:");
            String inputString = inputAndOutput.getInput(new SystemInput());
            specialNumber = new Converter(inputString).convert();
            if (new Checker(specialNumber).check()) { break; }
        }

        return specialNumber;
    }
}
