package co.com.bancolombia.certification.retointeraccion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.retointeraccion.userinterfaces.Enter.BTN_ENTER;

public class GoTo implements Task {

    public static GoTo theApp() {
        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ENTER));
    }
}
