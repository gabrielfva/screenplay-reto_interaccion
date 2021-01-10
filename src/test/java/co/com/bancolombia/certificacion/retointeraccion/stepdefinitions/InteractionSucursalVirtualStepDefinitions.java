package co.com.bancolombia.certificacion.retointeraccion.stepdefinitions;

import co.com.bancolombia.certification.retointeraccion.tasks.OpenTheBrowser;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class InteractionSucursalVirtualStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor gabriel = Actor.named("Gabriel");

    @Before
    public void setUp(){
        gabriel.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that Gabriel wants to try to enter to the Bancolombia's virtual branch$")
    public void thatGabrielWantsToTryToEnterToTheBancolombiaSVirtualBranch() {
        gabriel.wasAbleTo(OpenTheBrowser.on());
        //2. Dirigirse al botón entrar y hacer clic sobre él;
    }


    @When("^he inserts the user (.*) and his numeric password$")
    public void heInsertsTheUserAndHisNumericPassword(String arg1) {
        throw new PendingException();
    }

    @Then("^he should see the message: (.*)$")
    public void heShouldSeeTheMessage(String arg1) {
        throw new PendingException();
    }
}
