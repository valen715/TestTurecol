/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Registro {

    WebDriver driver;
    By ingresaNombre = By.cssSelector("#nombres");
    By ingresaCorreo = By.cssSelector("#correo");
    By ingresaClave = By.cssSelector("#clave");
    By BotonRegistro = By.cssSelector("#root > header:nth-child(3) > section > section > div.ingreso > a:nth-child(3) > button");
    By BotonRegistroB = By.cssSelector("#root > div > from > input[type=submit]:nth-child(9)");


    public Registro(WebDriver driver) {

        this.driver = driver;

    }
    
    public void setIngresaNombre(String nombre){
        driver.findElement(ingresaNombre).sendKeys(nombre);
    }

    public void setIngresaCorreo(String correo) {

        driver.findElement(ingresaCorreo).sendKeys(correo);

    }

    public void setIngresaClave(String clave) {

        driver.findElement(ingresaClave).sendKeys(clave);

    }

    public void clickRegistro() {

        driver.findElement(BotonRegistro).click();

    }
    
    public void clickRegistroB (){
        driver.findElement(BotonRegistroB).click();
    }
    
    

    

    public void registroApplication(String nombre, String correo, String clave) throws InterruptedException {
        
        this.clickRegistro();
        this.setIngresaNombre(nombre);
        this.setIngresaCorreo(correo);         
        this.setIngresaClave(clave);
        this.clickRegistroB();
        Thread.sleep(1000);

    }

    

}