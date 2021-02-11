package co.com.choucair.certification.proyectobancolombia.stepdefinitions;

import co.com.choucair.certification.proyectobancolombia.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobancolombia.questions.Answer;
import co.com.choucair.certification.proyectobancolombia.tasks.Login;
import co.com.choucair.certification.proyectobancolombia.tasks.OpenUp;
import co.com.choucair.certification.proyectobancolombia.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled( "Brandon").wasAbleTo(OpenUp.thepage(), (Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));

        //throw new PendingException();
    }


    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAtomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
        //throw new PendingException();
    }

    @Then("^he finds the course called resources $")
    public void heFindsTheCourseCalledResourcesRecursosAutomatiónBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(academyChoucairData.get(0).getStrCourse())));
        //throw new PendingException();
    }
}
