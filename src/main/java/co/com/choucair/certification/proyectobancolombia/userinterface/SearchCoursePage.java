package co.com.choucair.certification.proyectobancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target SU_BUTTON = Target.the("button for select the Choucair University")
            .located(By.xpath("//div[@id='universidad']//strong"));
    //.located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_COURSE = Target.the("search course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO= Target.the("click to search course")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE  = Target.the("button that validate if the user and password are right")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));

    public static final Target NAME_COURSE  = Target.the("course name outside")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));

}
