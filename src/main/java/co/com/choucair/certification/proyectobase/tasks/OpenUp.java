package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static Open thePage() {
        return Tasks.instrumented(Openup.class);
    }


    @Override
    public <T extends Actor> void performaAs(T actor){
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
