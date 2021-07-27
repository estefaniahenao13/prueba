package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LoginTask implements Task {
    private final String usuario;
    private final String contrasena;

    public LoginTask(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(LoginUI.INPUT_USER_NAME));
        actor.attemptsTo(Enter.theValue(contrasena).into(LoginUI.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(LoginUI.BUTTON_SIGN_IN));
    }

    public static Performable inicioSesion(String usuario, String contrasena){
        return instrumented(LoginTask.class,usuario,contrasena);
    }
}
