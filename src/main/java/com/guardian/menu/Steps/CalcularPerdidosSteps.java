package com.guardian.menu.Steps;

import com.guardian.menu.Pages.CalcGDPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class CalcularPerdidosSteps extends ScenarioSteps {

    @Page
    private CalcGDPage calcGDPage;

    @Step
    public void calcularSumaPerdidos(){
         calcGDPage.calcularSumaPerdidos();
    }

    @Step
    public void validarPerdidos(ExamplesTable dataLost){
        calcGDPage.validarPerdidos(dataLost);
    }

}
