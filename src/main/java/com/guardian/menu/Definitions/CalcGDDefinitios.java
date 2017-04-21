package com.guardian.menu.Definitions;

import com.guardian.menu.Steps.CalcGDSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

/**
 * Created by julinave on 21/04/2017.
 */
public class CalcGDDefinitios {
    @Steps
    CalcGDSteps calcGDSteps;

    @Given("estoy en la pagina con la tabla de la premier league")
    public void abrirPagina(){
        calcGDSteps.abrirPag();
    }

    @When("Calculo y valido dif gol")
    public void CalcElementGD(){
        calcGDSteps.CalcElementGD();
    }
}
