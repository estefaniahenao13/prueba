package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.LoginQuestions;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStep {
    @Before //Antes del given garantizar las propiedades del propeties

    public void setThestage() {
        OnStage.setTheStage(new OnlineCast()); // como apunto a mis properties

    }

    @Given("^El cliente abre la pagina web$")
    public void el_cliente_abre_la_pagina_web() throws Throwable {
        theActorCalled("cliente").attemptsTo(Open.url("https://demo.applitools.com/"));
    }

    @When("^El cliente (.+) y (.+)")
    public void el_cliente_test_y_test(String usuario, String contrasena) {
        theActorCalled("cliente").attemptsTo(LoginTask.inicioSesion(usuario,contrasena));
    }

    @Then("^debo ver mi cuenta (.+)$")
    public void debo_ver_mi_cuenta(String validtexto)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestions.Loginvalidtex(validtexto)));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}