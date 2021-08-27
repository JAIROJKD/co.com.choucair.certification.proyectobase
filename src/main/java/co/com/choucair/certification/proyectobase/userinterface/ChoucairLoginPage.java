package co.com.choucair.certification.proyectobase.userinterface;

import net.serenity.core.page.PageObject;
import net.serenity.screenplay.targets.Target;
import java.lang.annotation.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the( targetElementName "button that shows us form to login")
            .located(By.xpath("//div[@class = 'd-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target IMPUT_USER = Target.the( targetElementName "where do we white the user")
            .located(By.id("username"));
    public static final Target IMPUT_PASSWORD = Target.the( targetElementName "where do we white the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the( targetElementName "button to confirm login")
            .located(By.xpath("//botton[contains(@class, 'btn btn-primary')]"));
}
