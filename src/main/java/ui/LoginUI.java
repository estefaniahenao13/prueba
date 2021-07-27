package ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target INPUT_USER_NAME = Target.the("ingresa el usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña").located(By.id("password"));
    public static final Target BUTTON_SIGN_IN = Target.the("boton login").located(By.id("log-in"));
}
