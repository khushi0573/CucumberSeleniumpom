package com.runner;

import org.junit.runner.RunWith;

import com.base.TestBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// driver class
@CucumberOptions(features="feature",glue="stepdef",dryRun=false,
plugin={"pretty","json:target/cucumber.json","html:target/index.html"})

public class TestRunner extends TestBase {

}
