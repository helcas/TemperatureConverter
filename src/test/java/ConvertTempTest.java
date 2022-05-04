import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

//Listener at class level (also in testNG.xml file).
@Listeners(MyListener.class)

public class ConvertTempTest {

    ConvertTemp temp = new ConvertTemp();

    //test trying the data provider
    @Test (dataProvider = "getData")
    public void convertToFahrenheit(double actual, double expected){

        assertEquals(actual, expected);
    }

    //regular test (group 1 in testNG.xml file)
    // trying the retryAnalyzer so this test will fail.
    @Test (groups = {"group 1"}, retryAnalyzer = MyRetryAnalyzer.class)
       public void convertToCelcius(){
        assertEquals(37.78, temp.convertToCelcius(101));
    }

    //data provider for the first test
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][2];
        data[0][0] = 32.00;
        data[0][1] = temp.convertToFahrenheit(0.00);
        data[1][0] = 212.00;
        data[1][1] = temp.convertToFahrenheit(100.00);

        return data;
    }
}