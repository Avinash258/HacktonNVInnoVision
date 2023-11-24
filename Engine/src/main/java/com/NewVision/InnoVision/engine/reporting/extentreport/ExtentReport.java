/*
 * Copyright 2014 - 2021 NewVision Technology Solutions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.NewVision.InnoVision.engine.reporting.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import tech.grasshopper.reporter.ExtentPDFReporter;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
		
    public static ExtentSparkReporter sparkReporter;
    public static ExtentPDFReporter pdfReporter;
    public static ExtentReports extentReports;
    public static ExtentTest test;
    
//    public static void main(String[] args) {
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//        // Set logo
//        htmlReporter.config().setDocumentTitle("Extent Report");
//        htmlReporter.config().setReportName("Test Report");
//        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
//
//        // Add custom logo
//        htmlReporter.config().setEncoding("utf-8");
//        htmlReporter.config().setCSS("css-string"); // You can use this to add custom CSS styles
//
//        // Add the logo
//        htmlReporter.config().setJS("js-string"); // You can use this to add custom JavaScript
//
//        // Add the logo
//        htmlReporter.config().insertCustomStyles(".navbar {background-color: #1f2632;}");
//
//        // Replace the path with the actual path to your logo
//        htmlReporter.config().setImagePath("resources/reporting/logo-16.png");
//
//        extent.flush();
//    }
    
}
