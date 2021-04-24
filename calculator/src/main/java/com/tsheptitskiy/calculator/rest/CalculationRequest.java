package com.tsheptitskiy.calculator.rest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Taras Sheptytskyi
 */
@Getter
@Setter
public class CalculationRequest {
    private Integer leftDigit;
    private Integer rightDigit;

}