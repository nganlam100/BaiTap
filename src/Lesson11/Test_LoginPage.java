package Lesson11;

public class Test_LoginPage {
    public static void main(String[] args) {
        testInternalLoginPage("username1", "password1");
        testExternalLoginPage("username2", "password2");
    }
    private static void testInternalLoginPage(String username, String password){
        LoginFlow loginFlow = new LoginFlow(new InternalLoginPage());
        loginFlow.login(username,password);
    }
    private static void testExternalLoginPage(String username, String password){
        LoginFlow loginFlow = new LoginFlow(new ExternalLoginPage());
        loginFlow.login(username,password);

    }
}
