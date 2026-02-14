package com.saucedemo.reportings; // Added 'com.' at the start

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    public static ExtentReports createInstance() {
        String reportPath = System.getProperty("user.dir") + "/Reports/";
        File folder = new File(reportPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath + "TestReport.html");
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Sauce Demo Tests");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        return extent;
    }
}

