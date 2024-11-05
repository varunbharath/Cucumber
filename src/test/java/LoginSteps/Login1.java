package LoginSteps;

import driver.driverInstance;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Login1 extends driverInstance {
    @Given(": user should enter {string} and {string}")
    public void user_should_enter_and(String username, String password) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

    }
    @When(": user click the login button")
    public void user_click_the_login_button() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Then(": user should be success or failed")
    public void user_should_be_success_or_failed() {
       String case1= driver.getCurrentUrl();
        System.out.println(case1);

    }

}
