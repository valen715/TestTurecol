/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Validacion;

import PageObjects.InicioSesion;
import PageObjects.Opiniones;
import PageObjects.Registro;

public class TurecolTest {

    private static WebDriver driver = null;
    private static final String URL = "http://localhost:4200/";

    InicioSesion iniciarSesion;
    Registro registro;
    Opiniones opiniones;
    Validacion validacion;

    public TurecolTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("1. Inicio de la prueba");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void setUp() {
        driver.get(URL);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void testMain() throws InterruptedException {
        String nombre = "teo";
        String correoRegistro = "teo@turecol.com";
        String claveRegistro = "teo123";
        registro = new Registro (driver);
        registro.registroApplication(nombre, correoRegistro, claveRegistro);
        
        validacion = new Validacion(driver);
        
        
        assertEquals("validar texto", "Usuario existente", validacion.getValidRegistroUsuarioExistente());
        Thread.sleep(4000);
        driver.navigate().back();
        System.out.println("2. final registro");
        
        String correo = "teo@turecol.com";
        String clave = "teo123";
        iniciarSesion = new InicioSesion(driver);
        iniciarSesion.loginApplication(correo, clave);         
        
        assertEquals("validar texto", "Usuario logueado exitosamente", validacion.getValidInicio());
        Thread.sleep(4000);
        System.out.println("3. final inicio sesion");
         
        String departamento = "Amazonas";
        String calificacion = "3";
        String opinion = "Muy bonito lugar";
        opiniones = new Opiniones(driver);
        opiniones.registroOpiniones(departamento, calificacion, opinion);
        Thread.sleep(3000);
        
        assertEquals("validar texto", "Opinion creada exitosamente", validacion.getValidOpinion());
        Thread.sleep(4000);
        System.out.println("3. final registro opiniones");
        

    };
    
   

}
