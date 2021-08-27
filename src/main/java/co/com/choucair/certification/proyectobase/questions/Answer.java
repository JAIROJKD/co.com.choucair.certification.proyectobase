package co.com.choucair.certification.proyectobase.question;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Question.Text;

public class Answer implements Question<Boolean> {
    public String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    public Boolean answeredBy(Actor actor){
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(question.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return null;
    }
}

