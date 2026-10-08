package com.example.arrays.factory;

import com.example.arrays.entity.NumberArray;

public class NumberArrayFactory {

    public NumberArray create(int[] values) {
        return new NumberArray(values);
    }
}

