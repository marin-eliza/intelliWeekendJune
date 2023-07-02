package pageobjects;

import reusable.BrowserCall;

public class SearchResultPage extends BrowserCall {

    int a = 1;
    public static String getTitle(){

       return getDriver().getTitle();

    }

}
