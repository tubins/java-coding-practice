package com.tubz;

import com.tubz.array.FindPeek;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FindPeekTest {

    @Test
    void shouldReturnPeekOfTheArray() {
            int result = FindPeek.findPeek(new int[]{ 12, 48, 20});
            assertEquals(1, result);
    }


}