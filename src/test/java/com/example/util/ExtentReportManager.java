
package com.example.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ExtentSparkReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            htmlReporter = new ExtentSparkReporter("target/extent-report.html");
            htmlReporter.config().setDocumentTitle("Automation Report");
            htmlReporter.config().setReportName("Cucumber Test Report");
            htmlReporter.config().setTheme(Theme.STANDARD);

            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("OS", "Windows");
            extent.setSystemInfo("Tester", "Karthik");
        }
        return extent;
    }

    public static ExtentTest createTest(String name, String description) {
        test = getInstance().createTest(name, description);
        return test;
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void flush() {
        getInstance().flush();
    }
}
