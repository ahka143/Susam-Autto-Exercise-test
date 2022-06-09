package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage_Sena {
    public AutoExercisePage_Sena(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
