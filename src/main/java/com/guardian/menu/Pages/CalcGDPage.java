package com.guardian.menu.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

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

    public int CalcWin(){
        int SWin = 0;
        for (int i=1;i<=4;i++){
            int WCh = Integer.parseInt(GetElements(i,4).getText());
            SWin=SWin+WCh;
        }

        return SWin;
    }

    public void ValSuma(int stSuma, ExamplesTable dtTable){
        Map<String,String> tbData=dtTable.getRow(0);
        int Valsumatb = Integer.parseInt(tbData.get("cantwin"));
        MatcherAssert.assertThat("La suma no coincide", stSuma==Valsumatb);


    }

    private WebElementFacade GetElements (int row, int column){
        return element(By.xpath(stXpath +"/tr["+row+"]/td["+column+"]"));
    }
}
