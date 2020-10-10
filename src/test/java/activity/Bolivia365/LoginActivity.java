package activity.Bolivia365;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;



public class LoginActivity {
    public TextBox email;
    public TextBox codigo;
    public Button saveButton;

    public LoginActivity(){
        email = new TextBox(By.id("com.bolivia365.bolivia365:id/username"));
        codigo = new TextBox(By.id("com.bolivia365.bolivia365:id/password"));
        saveButton = new Button(By.id("com.bolivia365.bolivia365:id/login"));
    }
}
