package com.tubz.other;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlaces() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, -3.176));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}