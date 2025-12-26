//package bank;
//Access Modifiers
class Account{
    public String name;
    protected String email;
    private String password;
    //getters and setters
    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
         this.password=pass;
    }
}

public class Banks {
    public static void main(String[] args){
        Account account1=new Account();
        account1.name="APNA college";
        account1.email="apnacollege@gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
    
}
