package co.com.choucair.certificacion.proyectobase.stepdefinitions;
import co.com.choucair.certification.KevinC.tasks.Login;
import co.com.choucair.certification.KevinC.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course Recursos Automatización Bancolombia on the choucair plataform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlataform() {

    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia() {

    }

}
