import rd01.oop.workshop.acquaintance.IBuildingManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public class UnitMain implements IBuildingManagementSystem {



    private UUID id;
    private String name;

    //constructor if needed
    public UnitMain(UUID id, String name) {
        this.id = id;
        this.name = name;
    }


    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {

        return name;
    }

    public static void main(String[] args) {

        // create UUID
        UUID u1 = new UUID(33l, 22l);
        //create area/unitMain
        UnitMain i1 = new UnitMain(u1, "Tek");

        //create arraylists for sensors and actuators

        ArrayList<Sensor> Slist = new ArrayList<>();
        ArrayList<Aktuator> Alist = new ArrayList<>();

        //create building

        Building b1 = new Building(u1, "tek", Slist, Alist);

        //add building to buildingadministationsystem

        BuildingAdministrationSystem BA1 = new BuildingAdministrationSystem();

        //add buildings to BA1

        BA1.addBuilding(b1);

        //create sensors

        Co2Sensor c1 = new Co2Sensor(25, "c1");

        //create actuators

        b1.addCo2Sensor(c1);

        System.out.println(b1.getSensors() + "\n");


        b1.removeSensor(c1);

        System.out.println(b1.getSensors());

        //adding actuator
        Aktuator a1 = new Aktuator(2, "A1");

        b1.addActuator(a1);

        //setting new actuatorvalue
        a1.setValue(5);

        //printing new value
        System.out.println(a1.getValue());

        //list buildings
        System.out.println(BA1.getBuildings());


        //list actuators
        System.out.println(b1.getActuators());


    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        return null;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        return null;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        return null;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        return null;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {

    }
}