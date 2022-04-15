package Lesson11;

public class ExternalLoginPage extends LoginPage{

    @Override
    String usernameSel() {
        return "ExternalLoginPage | username";
    }

    @Override
    String passwordSel() {
        return "ExternalLoginPage | password";
    }

    @Override
    String loginBtnSel() {
        return "ExternalLoginPage | login btn";
    }
}
