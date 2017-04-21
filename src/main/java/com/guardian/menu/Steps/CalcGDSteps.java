package com.guardian.menu.Steps;

import com.guardian.menu.Pages.CalcGDPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

/**
 * Created by julinave on 21/04/2017.
 */
public class CalcGDSteps extends ScenarioSteps{
    @Page
    private CalcGDPage CalcGDPage;

    @Step
    public void abrirPag(){
        CalcGDPage.open();
    }

    @Step
    public void CalcElementGD(){
        CalcGDPage.CalcElementGD();
    }
}
