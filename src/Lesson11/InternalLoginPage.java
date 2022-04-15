package Lesson11;

public class InternalLoginPage extends LoginPage{
    @Override
    String usernameSel() {
        return "InternalLoginPage | username";
    }

    @Override
    String passwordSel() {
        return "InternalLoginPage | password";
    }

    @Override
    String loginBtnSel() {
        return "InternalLoginPage | login btn";
    }
}
