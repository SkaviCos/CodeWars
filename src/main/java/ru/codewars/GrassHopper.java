package ru.codewars;

public class GrassHopper {
    public static String weatherInfo(int temperature) {
        int celsius = (temperature - 32) * 5/9;
        double c = (double)celsius;
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static void main(String[] args) {
        
    }

   /* public static int convertToCelsius(int temperature) {
        int celsius = (temperature - 32) * 5/9;
        return celsius;
    }*/
}
