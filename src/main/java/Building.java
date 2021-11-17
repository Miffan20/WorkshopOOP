
import java.util.ArrayList;

public class Building extends Unit {

    // Attributes
    private ArrayList<Sensor> sensors= new ArrayList<Sensor>(); // ArrayList for sensor
    private ArrayList<Aktuator> actuators = new ArrayList<Aktuator>(); //ArrayList for actuators
    private Object TemperaturSensor;

    //Constructor

    public Building(ArrayList<Sensor> sensors, ArrayList<Aktuator> actuators) {
        this.sensors = sensors;
        this.actuators = actuators;
    }


    //methods:
    // Add

    public void addSensor(TemperaturSensor ats1){
        sensors.add(ats1);
    }

    public void addCo2Sensor(Co2Sensor acs1){
        actuators.add(acs1);
    }
    
    //remove

    public void removeSensor(TemperaturSensor rts1){
        sensors.remove(rts1);
    }

    public void removeSensor(Co2Sensor rcs1){
        actuators.remove(rcs1);
    }

    //remove

    //Getter 'n' Setters
    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<Sensor> sensors) {
        this.sensors = sensors;
    }

    public ArrayList<Aktuator> getActuators() {
        return actuators;
    }

    public void setActuators(ArrayList<Aktuator> actuators) {
        this.actuators = actuators;
    }

}

