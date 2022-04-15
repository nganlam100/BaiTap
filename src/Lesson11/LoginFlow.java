package Lesson11;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow (LoginPage loginPage){
        this.loginPage = loginPage;
    }

    public void login(String username, String password){
        loginPage.login(username,password);
    }
}
