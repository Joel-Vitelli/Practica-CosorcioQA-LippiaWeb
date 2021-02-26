package com.consorcio.web.steps;

import com.consorcio.web.pages.wikipedia.GoogleHomePage;
import com.consorcio.web.pages.wikipedia.WikipediaHomePage;
import com.consorcio.web.pages.wikipedia.WikipediaResultsPage;
import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class GoogleSteps extends PageSteps {

    @Given("el usuario se encuentra en la pantalla de Google")
    public void elUsuarioSeEncuentraEnLaPantallaDeGoogle() {
        Injector._page(GoogleHomePage.class).goToHomePage();
    }

    @When("el usuario ingresa la palabra (.*)")
    public void elUsuarioIngresaLaPalabra(String palabra) {
        Injector._page(GoogleHomePage.class).setSearchInput(palabra);
        Injector._page(GoogleHomePage.class).clickSearchButton();
    }

    @Then("el usuario encuentra el resultado entre la segunda opcion")
    public void elUsuarioEncuentraElResultadoEntreLaSegundaOpcion() {
        Injector._page(GoogleHomePage.class).verificarResultado();
    }

    @Then("el usuario visualiza la siguiente lista de palabras en un resultado")
    public void elUsuarioVisualizaLaSiguienteListaDePalabrasEnUnResultado(List<String> listaPalabras) {
        Injector._page(GoogleHomePage.class).verificarResultadoLista(listaPalabras);
    }
}
