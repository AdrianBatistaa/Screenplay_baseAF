package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;



public class Login implements Task {


    private String srtUser;
    private String srtPassword;
    public Login(String srtUser, String srtPassword) {
        this.srtUser = srtUser;
        this.srtPassword = srtPassword;
    }
    public static Login onThePage(String strUSer, String strPassword) {
        return Tasks.instrumented(Login.class,strUSer,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
            Enter.theValue(srtUser).into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue(srtPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
            Click.on(ChoucairLoginPage.ENTER_BUTTON)
            );
    }
}
