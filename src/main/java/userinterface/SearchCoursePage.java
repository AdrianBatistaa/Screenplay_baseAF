package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage  extends PageObject {
    public static  final Target BUTTON_UC = Target.the("Selecciona la Universidad Choucair").located(By.xpath("//*[@id='universidad']/div[1]/a/h4/strong"));
    public static  final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static  final Target Button_GO = Target.the("Da click para buscar el curso").located(By.xpath("//*[@id=\"yui_3_17_2_1_1617265113988_20\"]/button"));
    public static  final Target SELECT_COURSE = Target.the("Selecciona el curso").located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[2]/div/div/a/div[2]/h4"));
    public static  final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos automatización Bancolombia')}"));

}
