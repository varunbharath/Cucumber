//package LoginSteps;
//
//import driver.driverInstance;
//import io.cucumber.java.en.But;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//public class Login extends driverInstance {
////    @Given("User should enter the username as standard_user")
////    public void user_should_enter_the_username_as_standard_user() {
////        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
////        username.sendKeys("standard_user");
////
////    }
////    @Given("User should enter the password as secret_sauce")
////    public void user_should_enter_the_password_as_secret_sauce() {
////        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
////        password.sendKeys("secret_sauce");
////
////    }
//
//    @Given("User should enter the username as {string}")
//    public void user_should_enter_the_username_as(String username) {
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
//    }
//    @Given("User should enter the password as {string}")
//    public void user_should_enter_the_password_as(String password) {
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//
//    }
//
//    @When("User click on login button")
//    public void user_click_on_login_button() {
//        driver.findElement(By.xpath("//input[@id='login-button']")).click();
//    }
//    @Then("login should be success")
//    public void login_should_be_success() {
//
//        String url= driver.getCurrentUrl();
//        System.out.println(url);
//
//    }
//
//
//
////    @Given("User should enter the username as Teacher_user")
////    public void user_should_enter_the_username_as_teacher_user() {
////        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
////        username.sendKeys("standard_ur");
////    }
////    @Given("User should enter the password as Password")
////    public void user_should_enter_the_password_as_password() {
////        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
////        password.sendKeys("secret");
////
////    }
//    @When("User click on login buttons")
//    public void user_click_on_login_buttons() {
//        driver.findElement(By.xpath("//input[@id='login-button']")).click();
//    }
//    @But("login should be fail")
//    public void login_should_be_fail() {
//        String Expected = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
//
//        System.out.println(Expected);
//
//        Assert.assertEquals(Expected,"Epic sadface: Username and password do not match any user in this service");
//
//    }
//
//
//
//}
