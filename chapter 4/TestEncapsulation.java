public class TestEncapsulation {
    public static void main(String[] args){
        User people=new User();
        String changeUsername="003";
        String changePassword="ghi";

        people.stolenUsername=changeUsername;
        people.stolenPassword=changePassword;
        System.out.println(people.stolenUsername);
        System.out.println(people.stolenPassword);

        people.setPassword("abd","ghi");
    }
}

