package UIPages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.scs.ubbcluj.ro/webmail/?_task=logout&_token=yLATVwh1RGfFU6jk6M7lTu2SiD1gv437")
public class LoginPage extends PageObject {

    public void doLogin(){
        $("#email").sendKeys("janthird2021batch@gmail.com");
        $("#passwd").sendKeys("Selenium12345");
        $("#SubmitLogin").click();

    }

    public String accountPageIsVisible(){
        return $("div#center_column h1").getText();
    }

    public void goToContactsUsPage(){
        $(By.linkText("Contact us")).click();
    }

}
