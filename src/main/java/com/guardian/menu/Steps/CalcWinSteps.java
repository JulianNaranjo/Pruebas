package com.guardian.menu.Steps;

import com.guardian.menu.Pages.CalcGDPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by julinave on 25/04/2017.
 */
public class CalcWinSteps extends ScenarioSteps {
    @Page
    private CalcGDPage calcGDPage;

    @Step
    public void abriPag(){
        calcGDPage.open();
    }

    @Step
    public int CalcWin(){
        return calcGDPage.CalcWin();
    }

    @Step
    public void ValSuma(int stSuma, ExamplesTable dtTable){
        calcGDPage.ValSuma(stSuma,dtTable);
    }

}
