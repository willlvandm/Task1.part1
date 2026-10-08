package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;

import java.util.Optional;

public interface MinMaxService {
    Optional<Integer> findMin(NumberArray array);
    Optional<Integer> findMax(NumberArray array);
}

