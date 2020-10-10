package activity.Bolivia365;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

   public Label videoShow;

   public MainActivity(){
       videoShow = new Label(By.id("com.bolivia365.bolivia365:id/exo_subtitles"));
   }
}
