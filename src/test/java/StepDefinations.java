import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations
{
    @Given("I navigate to url{string}")
    public void iNavigateToUrl(String url )
    {
        BaseTest.homePage.navigateToUrl(url);
    }

    @Then("I should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
        String homepageTitle= BaseTest.registerPage.getPageTitle();
        System.out.println(homepageTitle);

    }
    @When("I click on login link from the navbar")
    public void i_click_on_login_link_from_the_navbar()
    {
        BaseTest.homePage.clickLoginLink();
    }

    @Then("I should be navigate to logging")
    public void i_should_be_navigate_to_logging()
    {

        BaseTest.homePage.pageRefresh();
        String loginPageTitle = BaseTest.registerPage.getPageTitle();
        System.out.println(loginPageTitle);

    }
    @When("I enter email as {string}")
    public void i_enter_email_as(String em)
    {
        BaseTest.loginPage.enterEmail(em);
    }
    @When("I enter Password as {string}")
    public void i_enter_password_as(String pw)
    {
       BaseTest.loginPage.enterPassword(pw);
    }
    @When("I click on login button")
    public void i_click_on_login_button()
    {
        BaseTest.loginPage.clickLoginBtn();
    }
    @Then("I should be login successfully")
    public void i_should_be_login_successfully()
    {
        String loginPageTitle = BaseTest.registerPage.getPageTitle();
        System.out.println(loginPageTitle);

    }


}
