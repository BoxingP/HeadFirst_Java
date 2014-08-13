public class RunFizzBuzzWhizzMurmur {
    public static void main(String[] args) {
        System.out.println("Please input special numbers which should be four different digits:");
        FizzBuzzWhizzMurmur fbwm = new FizzBuzzWhizzMurmur();
        for (int testNumber=0;testNumber<101;testNumber++) {
            fbwm.process(testNumber);
        }
    }
}
