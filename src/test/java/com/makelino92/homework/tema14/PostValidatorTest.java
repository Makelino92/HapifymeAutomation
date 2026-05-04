package com.makelino92.homework.tema14;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostValidatorTest {
    private PostValidator validator;

    @BeforeClass
    public void setup() {
        validator = new PostValidator();
    }

    @DataProvider(name = "dateTest")
    public Object[][] testData() {
        return new Object[][] {
                {"Mesaj Valid", "POST_VALID"},
                {"", "ERROR_EMPTY"},
                {"Votati politica acum", "ERROR_FORBIDDEN"},
                {"A".repeat(251), "ERROR_TOO_LONG"}
        };
    }

    @Test(dataProvider = "dateTest")
    public void testValidari(String input, String rezultatAsteptat) {
        String rezultatReal = validator.getPostStatus(input);
        Assert.assertEquals(rezultatReal, rezultatAsteptat);
    }
