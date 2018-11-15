package edu.wctc.eligrow;

public enum EnumCalcTool {
    ENUMCALCTOOL;
    public static int totalBMICalcullated=0;
    public static int numberOfCaculations=0;
    enum MeasurementSystem {METRIC, ENGISH};

    private EnumCalcTool() { }

    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height,2);
        if (measurementSystem == MeasurementSystem.ENGISH) {
            bmi *= 703;
        }
        totalBMICalcullated+=bmi;
        numberOfCaculations++;

        return bmi;
    }
}
