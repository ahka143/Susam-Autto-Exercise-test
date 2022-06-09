package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage_Murat {

    public AutoExercisePage_Murat(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
