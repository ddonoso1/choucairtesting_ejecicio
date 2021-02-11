package co.com.choucair.certification.proyectobancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("text field where we can write the username")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("text field where we can write the password")
            .located(By.id("password"));

    public static final Target SESSION_BUTTON  = Target.the("button that validate if the user and password are right")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));




}
