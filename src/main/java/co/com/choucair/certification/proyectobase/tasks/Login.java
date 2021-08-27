package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Click;
import net.serenitybdd.screenplay.Enter;
import com.sun.jmx.snmp.tasks.Task;

public class Login implements Task {

    private String strUser;
    private String strPassword;
    public Loging(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }


    public static Loging onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(login.class, strUser,strPassword);

    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theVaLue(strUser).into(ChoucairLoginPage.USER),
                Enter.theVaLue(strPassword).into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}

