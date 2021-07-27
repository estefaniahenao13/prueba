package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target TEXT_VALID = Target.the("el cliente visualiza la pagina principal del demo").located(By.id("time"));
}
