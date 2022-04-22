package Lab13;

public abstract class LoginPage {
    NormalLogin normalLogin;
    SSOLogin ssoLogin;

    public void normalLogin(){
        normalLogin.login();
    }

    public void ssoLogin(){
        ssoLogin.login();
    }
}
