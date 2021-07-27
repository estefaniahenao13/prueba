package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUI;

public class LoginQuestions implements Question {
    private final String validtexto;

    public LoginQuestions(String validtexto) {
        this.validtexto = validtexto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(HomeUI.TEXT_VALID).viewedBy(actor).asString().equals(validtexto.toString()))
            return true;
        else
            return false;
    }

    public static LoginQuestions Loginvalidtex (String validtexto){
        return new LoginQuestions(validtexto);
    }
}
