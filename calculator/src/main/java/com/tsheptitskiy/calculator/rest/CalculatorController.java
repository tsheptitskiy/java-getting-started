package com.tsheptitskiy.calculator.rest;

import com.tsheptitskiy.calculator.model.OperationModel;
import com.tsheptitskiy.calculator.service.CalculateSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Taras Sheptytskyi
 */

@Controller
public class CalculatorController {
    @Autowired
    private CalculateSimple calculateSimple;

    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public CalculationResultResponse add(OperationModel operationModel, CalculationRequest calculationRequest ){
       return calculateSimple.add(operationModel, calculationRequest)
    }

}