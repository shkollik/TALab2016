package talab.listeners;

import org.testng.*;

/**
 * Created by Vladyslav_Shkola on 11/1/2016.
 */
public class Listener implements IInvokedMethodListener {


    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        Reporter.log("Class - " + returnClassName(iInvokedMethod.getTestMethod()) + ", Method - "
                + returnMethodName(iInvokedMethod.getTestMethod()) + ", Status - " + returnStatus(iTestResult)
                + ", Elapsed time: " + (iTestResult.getEndMillis() - iTestResult.getStartMillis()));
    }

    private String returnMethodName(ITestNGMethod method) {
        return method.getMethodName();
    }

    private String returnClassName(ITestNGMethod method) {
        return method.getRealClass().getSimpleName();
    }

    private int returnStatus(ITestResult result) {
        return result.getStatus();
    }
}
