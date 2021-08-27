package co.com.choucair.certification.proyectobase.stepdefinitions;

    import co.com.choucair.certification.proyectobase.question.Answer;
    import co.com.choucair.certification.proyectobase.tasks.Login;
    import co.com.choucair.certification.proyectobase.tasks.OpenUp;
    import co.com.choucair.certification.proyectobase.tasks.Search;
    import cucumber.api.java.Before;
    import cucumber.api.java.en.Given;
    import cucumber.api.java.en.Then;
    import cucumber.api.java.en.When;
    import net.serenitybdd.screenplay.GivenWhenThen;
    import net.serenitybdd.screenplay.actors.OnStage;
    import net.serenitybdd.screenplay.actors.OnlineCast;
    import org.junit.Before;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at academy choucair$")
    public void thanBrandonWantsToLearnAutomationAtAcademyChoucair(list<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorCalled( requiredActor "Brandon").wasAbleTo(OpenUp.thePage(), Login.
                onthePage(academyChoucairData.get(0).gatStrUser(),academyChoucairData.get(0).gatStrUser()));
        }
    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(list<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotligth().attemptsTo(Buscar.the(academyChoucairData.get(0).gatStrCourse()));
    }

    @then("^he finds the course called$")
    public void  heFindsTheCourseCalledRecursosAutomatizaciónBancolomnbia(list<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotligth().should(GivenWhenThen.seeThat(Answer.toThe(acade,academyChoucairData.get(0).gatStrCourse())));
    }


}


