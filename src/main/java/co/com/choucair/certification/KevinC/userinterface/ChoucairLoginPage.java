package co.com.choucair.certification.KevinC.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    private static String targetElementName;

    public static final Taget LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.xpath("//div[@class='d-done d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Taget   INPUT_USER = Target.the( targetElementName: "where do we write the user").located(By.id("username"));


    public static final Taget   INPUT_PASSWORD = Target.the( targetElementName: "where do we write the password").located(By.id("password"));

    public static final Taget   ENTER_BUTTON = Target.the( targetElementName: "button to confirm login").located(By.xpath("//button[contains](@class, 'btn btn-primary')"));
}

