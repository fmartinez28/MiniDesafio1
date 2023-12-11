package com.gmail.nafmartinez28;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CasosDePrueba extends Configuraciones {

    @BeforeEach
    public void setUp() {
        Configuraciones.inicializar();
    }

    @Test
    public void testCase1() {
        // Abrir la página de inicio
        Configuraciones.driver.get("https://www.ucu.edu.uy/");

        // Crear una instancia de la página
        HomeUCU paginaInicio = new HomeUCU(Configuraciones.driver);
        
        // Realizar acciones en la página
        paginaInicio.clickALoLoco();
    }

        // Añadir aserciones según sea necesario
        //assertTrue(stringActual.contains(textoEsperado));
        
        //Otro tipo de assertions sin usar Selenium Webdriver

         @Test
    public void testCase2() {
        // Abrir la página de inicio
        Configuraciones.driver.get("https://www.ucu.edu.uy/");

        // Crear una instancia de la página
        HomeUCU paginaInicio = new HomeUCU(Configuraciones.driver);
        
        // Realizar acciones en la página
        paginaInicio.clickALoLoco();

    }

     @AfterEach
    public void tearDown() {
        Configuraciones.cerrarNavegador();
    }
}