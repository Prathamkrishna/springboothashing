package practiceproject.springproject.controllers;

public class helloworldendpoint {
    private String password;

    public helloworldendpoint(String pass) {
        this.password = pass;
    }
    public String passw;

    public String setPassword(String password1){
        System.out.println(password1);
        passw = password1;
        return passw;
    }

    public String showPassword(){
        System.out.println(passw);
        return passw;
    }
}
