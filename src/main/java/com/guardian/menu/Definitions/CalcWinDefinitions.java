package com.guardian.menu.Definitions;

import com.guardian.menu.Steps.CalcWinSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by julinave on 26/04/2017.
 */
public class CalcWinDefinitions {

    @Steps
    CalcWinSteps calcWinSteps;

    @Given("estoy en la pagina con la tabla de la premier leagu")
    public void abrirPag (){
        calcWinSteps.abriPag();
    }

    @When("sumo la cantidad de partidos ganados")
    public void CalcWin(){
        calcWinSteps.CalcWin();
    }

    @Then("valido la cantidad de partidos ganados $dtTable")
    public void ValSuma(ExamplesTable dtTable){
        calcWinSteps.ValSuma(dtTable);
    }
}
