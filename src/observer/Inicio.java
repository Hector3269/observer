package observer;

public class Inicio {
    public static void main(String[] args) {
        Weather_Station Weather_Station = new Weather_Station();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        Weather_Warning weatherWarning = new Weather_Warning();

        Weather_Station.agregarObservador(temperatureDisplay);
        Weather_Station.agregarObservador(weatherWarning);

        Weather_Station.setTemperatura(25);
        Weather_Station.setTemperatura(35);
    }
}