

public class TemperaturSensor extends Sensor{


    public TemperaturSensor(double value) {
        super(value);

    }


    public void getCelsius(){

        System.out.println(getValue() + " Celsius");

    }
}
