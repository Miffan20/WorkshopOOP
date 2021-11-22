public class Co2Sensor extends Sensor {


    public Co2Sensor(double value, String name) {
        super(value, name);


    }


    public void getCO2Level(){

        System.out.println(getValue() + " CO2 Parts per million");

    }

    public String getName(){
        return name;
    }


}


