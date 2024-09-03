package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    private BonusService bonusService;

    @BeforeEach
    void setUp() {
       bonusService = new BonusService();
    }

    @AfterEach
    void tearDown() {
        bonusService = null;
    }

    @Test
    void testGetResWithExpectedResult() {
        double sales = 1000.0;
        String expected = "100.00";
        String actual = bonusService.getRes(sales);
        assertEquals(expected, actual, "The bonus calculation is incorrect");
    }

    @Test
    void testGetResWithUnexpectedResult() {
        double sales = -1000.0;
        String expected = "Incorrect value!";
        String actual = bonusService.getRes(sales);
        assertEquals(expected, actual, "The method should return 'Incorrect value!' for negative sales");
    }
}
