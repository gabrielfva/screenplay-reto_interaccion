package co.com.bancolombia.certification.retointeraccion.tasks;

import co.com.bancolombia.certification.retointeraccion.userinterfaces.VirtualBranchHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new VirtualBranchHomePage()));

    }

    public static OpenTheBrowser on() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }
}
