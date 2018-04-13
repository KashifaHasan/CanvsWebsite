package CanvsHomePage;

import Common.Base;
import org.testng.annotations.Test;

public class TC1 extends Base {

    @Test

    public void navTo() {
        //String title = driver.getTitle();
        clickByXpath("(//a[@data-controller='HeaderNavFolderTouch'])[1]");
    }

}
