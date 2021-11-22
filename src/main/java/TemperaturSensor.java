

public class TemperaturSensor extends Sensor{


    public TemperaturSensor(double value, String name) {
        super(value, name);

    }


    public void getCelsius(){

        System.out.println(getValue() + " Celsius");

    }
}
