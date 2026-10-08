package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;

import java.util.Optional;

public class SumServiceImpl implements SumService {

    @Override
    public Optional<Long> sum(NumberArray array) {
        int[] values = array.getValues();
        if (values.length == 0) {
            return Optional.empty();
        }
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        return Optional.of(sum);
    }
}
