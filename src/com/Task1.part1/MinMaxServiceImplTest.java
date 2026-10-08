package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;
import com.example.arrays.factory.NumberArrayFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinMaxServiceImplTest {

    private static final int[] VALUES = {5, 2, 8, 1, 9, 3};
    private static final int EXPECTED_MIN = 1;
    private static final int EXPECTED_MAX = 9;

    private MinMaxServiceImpl service;
    private NumberArray array;

    @BeforeEach
    void setUp() {
        service = new MinMaxServiceImpl();
        array = new NumberArrayFactory().create(VALUES);
    }

    @Test
    void findMinShouldReturnMinimalValue() {
        Optional<Integer> actual = service.findMin(array);

        assertEquals(Optional.of(EXPECTED_MIN), actual);
    }

    @Test
    void findMaxShouldReturnMaximalValue() {
        Optional<Integer> actual = service.findMax(array);

        assertEquals(Optional.of(EXPECTED_MAX), actual);
    }
}

