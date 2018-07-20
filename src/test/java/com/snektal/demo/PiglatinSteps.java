package com.snektal.demo;

import com.snektal.demo.translator.PiglatinTranslator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PiglatinSteps {

    private String input;
    private String output;
    boolean startsWithConsonant = false;

    @Given("^a word \"([^\"]*)\"$")
    public void aWord(String word) throws Exception {
       input = word;
    }

    @When("^we translate it$")
    public void weTranslateIt() throws Exception {
        PiglatinTranslator translator = new PiglatinTranslator();
        output = translator.translateJava8Style(input);

    }

    @Then("^the word should \"([^\"]*)\"$")
    public void theWordShould(String arg1) throws Exception {
       System.out.println("Value before = " + input);
        System.out.println("Value translated  = " + output);
        System.out.println("Value should be  = " + arg1);
       assert (arg1.equals(output));
    }


}
