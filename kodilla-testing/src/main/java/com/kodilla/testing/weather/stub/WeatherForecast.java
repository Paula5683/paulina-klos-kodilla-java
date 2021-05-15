package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Tempratures temperatures;

    public WeatherForecast(Tempratures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast(){
        Map <String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String,Double> temperature: temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateMeanValue(){
        double meanValue = 0;
        for (Map.Entry <String, Double> temperature: temperatures.getTemperatures().entrySet()){
            meanValue += temperature.getValue();
        }
        return meanValue / temperatures.getTemperatures().size();
    }
    public double GetTheMedian(){
        List<Double> temperatureList = new ArrayList<>();
        double median;
        for (Map.Entry <String, Double> temperature: temperatures.getTemperatures().entrySet()){
            double value =  temperature.getValue();
            temperatureList.add(value);
        }
        Collections.sort(temperatureList);
        if (temperatureList.size() % 2 != 0) {
            int element = temperatureList.size() / 2;
            median = temperatureList.get(element);
        } else{
            int element = temperatureList.size()/2;
            int element2 = temperatureList.size()/2 - 1;
            median = (temperatureList.get(element) + temperatureList.get(element2)) / 2.0;
        }
        return median;
    }
}
