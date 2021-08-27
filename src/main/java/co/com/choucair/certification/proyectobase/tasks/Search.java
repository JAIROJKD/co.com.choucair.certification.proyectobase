package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actions.Click;
import net.serenitybdd.screenplay.Actions.Enter;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search The(String course) { return Tasks.instrumented(Search.class,course); }



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theVaLue(course).into(ChoucairLoginPage.IMPUT_COURSE),
                Click.on(SearchCoursePage).BUTTON_GO),
                Click.on(ChoucairLoginPage.SELECT_COURSE)
        );

    }


}

