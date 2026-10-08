package com.example.arrays.entity;

import java.util.Arrays;

public class NumberArray {

    private final int[] values;

    public NumberArray(int[] values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    public int[] getValues() {
        return Arrays.copyOf(values, values.length);
    }

    public int length() {
        return values.length;
    }

    @Override
    public String toString() {
        return "NumberArray{values=" + Arrays.toString(values) + "}";
    }
}

