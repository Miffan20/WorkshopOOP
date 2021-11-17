public class Co2Sensor extends Sensor {

    public Co2Sensor(double value) {
        super(value);

    }


    public void getCO2Level(){

        System.out.println(getValue() + " CO2 Parts per million");

    }
}

}
