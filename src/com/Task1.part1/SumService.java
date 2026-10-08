package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;

import java.util.Optional;

public interface SumService {
    Optional<Long> sum(NumberArray array);
}

