public class User{
    private String username="001";
    private String password="abc";
    public String stolenUsername="002";
    public String stolenPassword="def";

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password,String rePassword){
        if (this.password.equals(password)){
            this.password=rePassword;
        } else {
            System.out.println("呵呵");
        }
    }
}


