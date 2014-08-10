public class RunFizzBuzzWhizz {
    public static void main(String[] args) {
        System.out.println("Please input special numbers which should be one to five different digits:");
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        System.out.println("Count off!");
        for (int testNumber=0;testNumber<101;testNumber++) {
            fbw.process(testNumber);
        }
    }
}
