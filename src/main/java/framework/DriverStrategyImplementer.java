package framework;

import framework.utils.Constants;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case Constants.CHROME:
                return new Chrome();
            default:
                return null;
        }
    }
}
