package com.bupt.ai.langchain4j.tools;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {

    @Tool
    public double sum(double a,double b){
        System.out.println("调用sum方法");
        return a+b;
    }

    @Tool
    public double squareRoot(double x){
        System.out.println("调用平方根方法");
        return Math.sqrt(x);
    }
}
