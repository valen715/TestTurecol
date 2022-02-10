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
 * @author ASUS
 */
public class Opiniones {

    WebDriver driver;
    By botonVerMas = By.xpath("//*[@id=\"root\"]/header[2]/section/div/div[1]/a/button");
    By botonDepartamento = By.cssSelector("#root > header:nth-child(2) > div > a:nth-child(2) > button");
    By botonCrearOpinion = By.cssSelector("#root > header:nth-child(2) > div.container > div:nth-child(1) > div > a > button");
    By ingresarDepartamento = By.cssSelector("#departamento");
    By ingresarCalificacion = By.cssSelector("#calificacion");
    By ingresarOpinion = By.cssSelector("#comentario");
    By botonRegistrarOpinion = By.cssSelector("#root > div > div > input.bonton-opinion");

    public Opiniones(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBotonverMas() {
        driver.findElement(botonVerMas).click();
    }

    public void clickDepartamento() {
        driver.findElement(botonDepartamento).click();
    }

    public void clickCrearOpinion() {
        driver.findElement(botonCrearOpinion).click();
    }
    
    public void setIngresarDepartamento(String departamento){
        driver.findElement(ingresarDepartamento).sendKeys(departamento);
    }
    
    public void setIngresarCalificacion (String calificacion){
        driver.findElement(ingresarCalificacion).sendKeys(calificacion);
    }
    
    public void setIngresarOpinion (String opinion){
        driver.findElement(ingresarOpinion).sendKeys(opinion);
    }
    
    public void clickBotonRegistrarOpinion (){
        driver.findElement(botonRegistrarOpinion).click();
    }
    
    public void registroOpiniones(String departamento, String calificacion, String opinion) throws InterruptedException{
        
        
        this.clickBotonverMas();
        Thread.sleep(1000);
        this.clickDepartamento();
        Thread.sleep(1000);
        this.clickCrearOpinion();
        Thread.sleep(1000);
        this.setIngresarDepartamento(departamento);
        Thread.sleep(1000);
        this.setIngresarCalificacion(calificacion);
        Thread.sleep(1000);
        this.setIngresarOpinion(opinion);
        Thread.sleep(1000);
        this.clickBotonRegistrarOpinion();
        Thread.sleep(1000);
    }

}
