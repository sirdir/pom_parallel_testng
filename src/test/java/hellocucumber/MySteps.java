package hellocucumber;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MySteps {

    @Given("my step")
    public void myStep() {
        open("https://cucumber.io/docs/guides/10-minute-tutorial/");
    }

    @When("my sleep")
    public void mySleep() {
        sleep(5000);
    }
    @Then("my close")
    public void close() {
        WebDriverRunner.closeWebDriver();
    }
}
