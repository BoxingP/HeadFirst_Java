public class FizzBuzzWhizz {
    private String keyboardInput;
    InputAndOutput inputAndOutput = new InputAndOutput();

    public FizzBuzzWhizz() {
        keyboardInput = inputAndOutput.getInput();
    }

    public void process(int testNumber) {
        int[] specialNumber = new Converter(keyboardInput).convert();
        if (!new Checker(specialNumber).check()) { return; }

        String result = new Changer(specialNumber).change(testNumber);
        inputAndOutput.printOutput(result);
    }
}
