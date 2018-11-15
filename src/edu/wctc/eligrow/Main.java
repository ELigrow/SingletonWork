package edu.wctc.eligrow;

public class Main {

    public static void main(String[] args) {
        System.out.println("CalcTool");
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of "
                + CalcTool.calcBMI(70, 195, CalcTool.MeasurementSystem.ENGISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of "
                + CalcTool.calcBMI(1.7, 84, CalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of "
                + CalcTool.calcBMI(63, 135, CalcTool.MeasurementSystem.ENGISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of "
                + CalcTool.calcBMI(2.1, 141, CalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + CalcTool.averageBMI());

        System.out.println("\nEnumCalcTool");
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of "
                + EnumCalcTool.calcBMI(70, 195, EnumCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of "
                + EnumCalcTool.calcBMI(1.7, 84, EnumCalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of "
                + EnumCalcTool.calcBMI(63, 135, EnumCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of "
                + EnumCalcTool.calcBMI(2.1, 141, EnumCalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + CalcTool.averageBMI());

        System.out.println("\nThreadSafeCalcTool");
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of "
                + ThreadSafeCalcTool.calcBMI(70, 195, ThreadSafeCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of "
                + ThreadSafeCalcTool.calcBMI(1.7, 84, ThreadSafeCalcTool.MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of "
                + ThreadSafeCalcTool.calcBMI(63, 135, ThreadSafeCalcTool.MeasurementSystem.ENGISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of "
                + ThreadSafeCalcTool.calcBMI(2.1, 141, ThreadSafeCalcTool.MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + CalcTool.averageBMI());
    }
}
