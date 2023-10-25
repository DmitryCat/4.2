package pro.sky.calculator.Service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    @Override
    public String divide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1/num2);
    }
}
