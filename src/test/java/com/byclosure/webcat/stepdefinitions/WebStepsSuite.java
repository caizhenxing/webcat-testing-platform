package com.byclosure.webcat.stepdefinitions;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SeleniumInteractionsClickLink.class,
        SeleniumInteractionsSearchForContentByText.class,
        SeleniumInteractionsClickButton.class,
        SeleniumInteractionsSearchForContentByText.class,
        SeleniumStepsFillFormTextFields.class})
public class WebStepsSuite {
}
