package com.snektal.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {"pretty", "json:target/cucumber.json",  "html:target/cucumber"} ,
        snippets=SnippetType.CAMELCASE,
        dryRun=false)
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

}
