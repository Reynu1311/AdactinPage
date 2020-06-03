package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@target\\\\rerunrerun.txt"},glue="org.stepdefinition")
public class FailedRunner {

}
