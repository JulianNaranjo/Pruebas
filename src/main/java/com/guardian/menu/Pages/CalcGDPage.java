package com.guardian.menu.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;


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

    private WebElementFacade GetElements (int row, int column){
        return element(By.xpath(stXpath +"/tr["+row+"]/td["+column+"]"));
    }
}
