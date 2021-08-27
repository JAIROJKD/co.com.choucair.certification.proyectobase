package co.com.choucair.certification.proyectobase.tasks;


import net.serenitybdd.core.pages.pageObject;

public class SearchCoursePage extends PageObject {
    public static final Target LOGIN_UC = Target.the( targetElementName "Selecciona la universidad choucair")
            .located(By.xpath("//div[@id = 'Universidad']//strong"));
    public static final Target IMPUT_CURSE = Target.the( targetElementName "Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the( targetElementName "Da click para buscar el curso")
            .located(By.id("//button[@class= 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the( targetElementName "Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));


}

