public class NumberChanger {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    private final String nameOne="Fizz";
    private final String nameTwo="Buzz";
    private final String nameThree="Whizz";

    public NumberChanger(String[] number) {
        firstNumber = Integer.valueOf(number[0]);
        secondNumber = Integer.valueOf(number[1]);
        thirdNumber = Integer.valueOf(number[2]);
    }

    public String change(int testNumber) {
        String number = Integer.toString(testNumber);
        return (number.contains(Integer.toString(firstNumber))) ? "Fizz" : changeMultiple(testNumber); 
    }
    
    private String changeMultiple(int testNumber) {
        String result = "";

        if (testNumber%firstNumber==0) { result += nameOne; }
        if (testNumber%secondNumber==0) { result += nameTwo; }
        if (testNumber%thirdNumber==0) { result += nameThree; }
        return result = result.equals("") ? Integer.toString(testNumber) : result;
    }
}
