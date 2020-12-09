package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature(){
        double temperature = 0;
        int counter = 0;

        for(Map.Entry<String,Double> entry : temperatures.getTemperatures().entrySet()){
            counter++;
            temperature += entry.getValue();
        }
        temperature /= counter;

        return temperature;
    }

    public double calculateMedianTemperature(){
        double median = 0;
        List<Double> list = new ArrayList<>();

        for(Map.Entry<String,Double> entry : temperatures.getTemperatures().entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);

        if(list.size() > 0){
            boolean even = list.size() % 2 == 0;
            double a = list.get(list.size()/2);
            double b = list.get(list.size()/2 - 1);

            if(even){
                median = (a + b)/2;
            }else {
                median = a;
            }
        }

        return median;
    }
}
