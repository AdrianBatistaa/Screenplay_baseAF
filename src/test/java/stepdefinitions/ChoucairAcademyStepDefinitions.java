package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Adrian wants to learn automation at the academy choucair$")
    public void thanAdrianWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Adrian").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));

    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorCalled("Adrian").attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources Recursos Automatizaciòn Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciònBancolombia() {

    }


}
