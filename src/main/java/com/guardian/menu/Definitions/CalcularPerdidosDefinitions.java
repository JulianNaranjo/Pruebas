package com.guardian.menu.Definitions;

import com.guardian.menu.Steps.CalcGDSteps;
import com.guardian.menu.Steps.CalcularPerdidosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CalcularPerdidosDefinitions {
    private int sumaPerdidos;

    @Steps
    private CalcGDSteps calcGDSteps;

    @Steps
    private CalcularPerdidosSteps calcularPerdidosSteps;

    @Given("estoy en la pagina con la tabla de la premier league")
    public void openPage(){
        calcGDSteps.abrirPag();
    }

    @When("sumo los partidos perdidos de cada equipo")
    public void calcularSumaPerdidos(){
        sumaPerdidos = calcularPerdidosSteps.calcularSumaPerdidos();
    }

    @Then("la suma debe resultar igual al dato en la tabla $dataLost")
    public void ValidarPerdidos(ExamplesTable dataLost){
        calcularPerdidosSteps.validarPerdidos(dataLost,sumaPerdidos);
    }
}
