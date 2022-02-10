/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author sala304
 */

public class Validacion {

    WebDriver driver;
    By ValidInicio = By.cssSelector("body > div.react-toast-notifications__container.css-nvf14r-ToastContainer > div > div > div.react-toast-notifications__toast__content.css-18gu508-Content");
    By ValidOpinion = By.cssSelector("body > div.react-toast-notifications__container.css-nvf14r-ToastContainer > div > div > div.react-toast-notifications__toast__content.css-18gu508-Content");
    By ValidRegistroUsuarioExistente = By.cssSelector("body > div.react-toast-notifications__container.css-nvf14r-ToastContainer > div > div > div.react-toast-notifications__toast__content.css-18gu508-Content");
    public Validacion(WebDriver driver) {

        this.driver = driver;

    }

    public String getValidInicio() {

        return driver.findElement(ValidInicio).getText();

    }

    public void loginApplication() {

        this.getValidInicio();

    }
    
    
    
    public String getValidRegistroUsuarioExistente(){
        return driver.findElement(ValidRegistroUsuarioExistente).getText();
    }
    
    public void registroExistenteApplication(){
        this.getValidRegistroUsuarioExistente();
    }
    
    public String getValidOpinion(){
        return driver.findElement(ValidOpinion).getText();
    }
    
    public void opinionApplication(){
        this.getValidOpinion();
    }

}
