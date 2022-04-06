package steps;

import io.cucumber.java.es.*;

import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Dado("^Cuando abro la pagina de google$")
    public void navigateToGoogle() {
        google.navigatetoGoogle();
    }
    @Cuando("^ingreso la (.+)$")
    public void enterInformation(String palabra) {
        google.enterCriteria(palabra);
    }
    // falta step entonces y assert's

}
