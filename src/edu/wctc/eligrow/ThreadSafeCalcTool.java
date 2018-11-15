package edu.wctc.eligrow;

public class ThreadSafeCalcTool {
    private static ThreadSafeCalcTool threadSafeCalcTool = new ThreadSafeCalcTool();

    private ThreadSafeCalcTool() {}

    public static ThreadSafeCalcTool SingleInstance(){
        return threadSafeCalcTool;
    }

    public static int totalBMICalcullated=0;
    public static int numberOfCaculations=0;
    enum MeasurementSystem {METRIC, ENGISH};

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
