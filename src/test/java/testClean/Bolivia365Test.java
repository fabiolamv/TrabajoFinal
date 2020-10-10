package testClean;

import activity.Bolivia365.LoginActivity;
import activity.Bolivia365.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sesionManager.Session;

import java.net.MalformedURLException;

public class Bolivia365Test {
    MainActivity mainActivity = new MainActivity();
    LoginActivity loginActivity = new LoginActivity();

    @Test
    public void verifyLogin() throws MalformedURLException {
        String email = "rruffat@gmail.com";
        String codigo = "ZS8OU2JF4M";
        loginActivity.email.type(email);
        loginActivity.codigo.type(codigo);
        loginActivity.saveButton.click();

        //Verificacion

        Assert.assertTrue("Errror, no se pudo realizar el login",mainActivity.videoShow.isDisplayed());

        /*String video = mainActivity.videoShow.getText();
        String video1 = mainActivity.videoShow.getText();

        Assert.assertEquals("Error no se loguea",video,video1);*/


    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
