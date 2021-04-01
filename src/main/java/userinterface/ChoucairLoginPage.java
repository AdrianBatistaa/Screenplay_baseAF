package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static  final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login").located(By.xpath("//*[@id=\"nav-menu\"]/ul/li/a/strong"));
    public static  final Target INPUT_USER = Target.the("Button that shows us the form to login").located(By.id("username"));
    public static  final Target INPUT_PASSWORD = Target.the("Button that shows us the form to login").located(By.id("password"));
    public static  final Target ENTER_BUTTON = Target.the("Button that shows us the form to login").located(By.xpath("//*[@id=\"yui_3_17_2_1_1617258085721_27\"]/div[3]/button"));
}
