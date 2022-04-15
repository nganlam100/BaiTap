package Lesson11;

public abstract class LoginPage {
    abstract String usernameSel();
    abstract String passwordSel();
    abstract String loginBtnSel();

    public void login(String username, String password){
        inputUsername(username);
        inputPassword(password);
        clickOnLoginBtn();
    }

    public void inputUsername(String username){
        System.out.println("username selector is " + usernameSel());
        System.out.println("Username is " + username);
    }
    public void inputPassword(String password){
        System.out.println("Password selector is " + passwordSel());
        System.out.println("Password is " + password);
    }
    public void clickOnLoginBtn(){
        System.out.println("login btn selector is " + loginBtnSel());
        System.out.println("click on btn");
    }

}
