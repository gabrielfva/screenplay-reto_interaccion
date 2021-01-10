package co.com.bancolombia.certification.retointeraccion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Enter {
    public static final Target BTN_ENTER = Target.the("Enter button").located(By.id("btn-transaccional"));
    //public static final Target BTN_ENTER = Target.the("Enter button").locatedBy("//a[@class='button-primary small']");
}
