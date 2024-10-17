package base;

import base.PageObjects.IntialPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Newbaseextent extends base {
    @Test
    public void extendbaselogic() throws InterruptedException {
        Thread.sleep(7000);
        utilities.Button_click(driver, firstpage.sumbit_btn);
        System.out.println("Button Clicked done");
    }
}
