package org.example;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();

        out.println(sumCalculator.sum(5));

    }
}