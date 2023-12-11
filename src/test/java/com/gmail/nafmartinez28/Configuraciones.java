package com.gmail.nafmartinez28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuraciones {

    public static WebDriver driver;
    public static String usuario;
    public static String contrasena;

    public static void inicializar() {
        // Configuración del driver, por ejemplo, para Chrome
        System.setProperty("webdriver.gecko.driver", "C:/Users/Facundo Martínez/Downloads/geckodriver-v0.33.0-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    String valorABuscar = "Selenium";

    public static void cerrarNavegador() {
        driver.quit();
    }
}