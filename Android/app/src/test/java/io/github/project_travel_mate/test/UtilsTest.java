package io.github.project_travel_mate.test;

import org.junit.Test;

import utils.Utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilsTest {

    @Test
    public void isValidEmail_correctEmail_returnsTrue() {
        assertTrue(Utils.isValidEmail("test@email.com"));
    }

    @Test
    public void isValidEmail_correctEmailNumbers_returnsTrue() {
        assertTrue(Utils.isValidEmail("test123@mail.com"));
    }

    @Test
    public void isValidEmail_correctEmailCapitals_returnsTrue() {
        assertTrue(Utils.isValidEmail("TEST@mail.com"));
    }

    @Test
    public void isValidEmail_incorrectEmailDoubleDomain_returnsTrue() {
        assertTrue(Utils.isValidEmail("test@mail.sport.gov"));
    }

    @Test
    public void isValidEmail_incorrectEmailWithoutAt_returnsFalse() {
        assertFalse(Utils.isValidEmail("testmail.com"));
    }

    @Test
    public void isValidEmail_incorrectEmailWithoutDomain_returnsFalse() {
        assertFalse(Utils.isValidEmail("test@mail"));
    }

}
