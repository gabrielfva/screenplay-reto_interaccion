package co.com.bancolombia.certificacion.retointeraccion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/interaction_sucursal_virtual.feature",
        glue = "co.com.bancolombia.certificacion.retointeraccion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class InteractionSucursalVirtualRunner {

}
