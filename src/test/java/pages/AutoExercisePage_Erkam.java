package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage_Erkam {

    public AutoExercisePage_Erkam(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
