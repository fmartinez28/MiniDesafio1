package com.gmail.nafmartinez28;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CasosDePrueba extends Configuraciones {

    @BeforeEach
    public void setUp() {
        Configuraciones.inicializar();
    }


        // Añadir aserciones según sea necesario
        //assertTrue(stringActual.contains(textoEsperado));
        
        //Otro tipo de assertions sin usar Selenium Webdriver

    @Test
    public void experienciaUcuTest(){
        
        //Abro pág en ExperienciaUCU
        Configuraciones.driver.get("https://www.ucu.edu.uy/categoria/Asuntos-Estudiantiles-369/");
        
        ExperienciaUCU experienciaPage = new ExperienciaUCU(Configuraciones.driver);

        experienciaPage.openActividadesAccordions();
        experienciaPage.closeActividadesAccordions();
    }
    @Test
    public void investigacionUcuTest(){
        
        Configuraciones.driver.get("https://www.ucu.edu.uy/categoria/Investigacion-366/");
        
        InvestigacionUCU investigacionPage = new InvestigacionUCU(Configuraciones.driver);

        investigacionPage.meetInvestigadores();
        investigacionPage.checkInspirationalQuotesOrSomethingLol();
    }
    @Test
    public void internacionalesUcuTest(){
        
        Configuraciones.driver.get("https://www.ucu.edu.uy/categoria/Internacionales-321");
        
        InternacionalesUCU internacionalesPage = new InternacionalesUCU(Configuraciones.driver);

        internacionalesPage.openAcordeones();
        internacionalesPage.changeLocationSalto();
    }

     @AfterEach
    public void tearDown() {
        Configuraciones.cerrarNavegador();
    }
}