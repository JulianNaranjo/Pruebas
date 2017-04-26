package com.guardian.menu.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.yecht.Data;

import java.util.Map;


@DefaultUrl("https://www.theguardian.com/football/tables")
public class CalcGDPage extends PageObject {
    private static String stXpath=".//*[@id='article']/div/div/div[1]/div[1]/div/div/table/tbody";

    public CalcGDPage (WebDriver driver){
        super (driver);
    }

    public void CalcElementGD(){
        for (int i=1;i<=4;i++){
            int GF = Integer.parseInt(GetElements(i,7).getText());
            int GC = Integer.parseInt(GetElements(i,8).getText());
            int DIF = Integer.parseInt(GetElements(i,9).getText());

            int DFc = GF-GC;

            MatcherAssert.assertThat("Los valores no son iguales",DIF==DFc);
        }
    }

    public int calcularSumaPerdidos(){
        int lostMatches = 0;
        for (int i=1;i<=4;i++){
            lostMatches += Integer.parseInt(GetElements(i,6).getText());
        }
        return lostMatches;
    }

    public void validarPerdidos(ExamplesTable tableLost, int sumaPerdidos){
        Map<String,String> dataLost = tableLost.getRow(0);
        int lostTableValue = Integer.parseInt(dataLost.get("lost"));
        MatcherAssert.assertThat("Los valores no coinciden",sumaPerdidos==lostTableValue);
    }

    private WebElementFacade GetElements (int row, int column){
        return element(By.xpath(stXpath +"/tr["+row+"]/td["+column+"]"));
    }
}
