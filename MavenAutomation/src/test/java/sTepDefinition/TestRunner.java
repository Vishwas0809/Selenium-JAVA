package sTepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFile/Login.feature" ,glue="sTepDefinition", 
monochrome=true,
plugin={"html:src/test/resources/Resourses/HtmlReport"})

public class TestRunner {

}
