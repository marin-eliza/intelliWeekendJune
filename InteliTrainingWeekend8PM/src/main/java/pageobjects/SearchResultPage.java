package pageobjects;

import reusable.BrowserCall;

public class SearchResultPage extends BrowserCall {

    public static String getTitle(){

       return getDriver().getTitle();

    }

}
