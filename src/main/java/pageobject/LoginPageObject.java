package pageobject;

public interface LoginPageObject {

    String loginPageTitle = "//*[@id=\"login\"]/h2";
    String username = "//*[@id=\"username\"]";
    String password = "//*[@id=\"password\"]";
    String submitButton = "//*[@id=\"submit\"]";

    String incorrectMessage = "//*[@id=\"error\"]";


}
