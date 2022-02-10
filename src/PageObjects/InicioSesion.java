/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InicioSesion {

    WebDriver driver;
    By ingresaCorreo = By.cssSelector("#correo");
    By ingresaClave = By.cssSelector("#clave");
    By BotonInicio = By.cssSelector("#root > header:nth-child(3) > section > section > div.ingreso > a:nth-child(2) > button");
    By BotonLogin = By.cssSelector("#root > div > from > input[type=submit]:nth-child(6)");
    
    

    public InicioSesion(WebDriver driver) {

        this.driver = driver;

    }

    public void setIngresaCorreo(String correo) {

        driver.findElement(ingresaCorreo).sendKeys(correo);

    }

    public void setIngresaClave(String clave) {

        driver.findElement(ingresaClave).sendKeys(clave);

    }

    public void clickBotonInicio() {

        driver.findElement(BotonInicio).click();

    }
    
    public void clickBotonLogin(){
        driver.findElement(BotonLogin).click();
    }
    
    

    

    public void loginApplication(String correo, String clave) throws InterruptedException {

        this.clickBotonInicio();
        this.setIngresaCorreo(correo);         
        this.setIngresaClave(clave);
        this.clickBotonLogin();
        Thread.sleep(4000);

    }

}
