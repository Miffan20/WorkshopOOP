import java.util.ArrayList;
import java.util.UUID;

public class UnitMain {


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
    public String toString() {

        return null;
    }

    public static void main(String[] args) {

        // create UUID
        UUID u1 = new UUID(22l,33l);
        //create area/unitMain
        UnitMain i1 = new UnitMain(u1, "Tek");

        //create arraylists for sensors and actuators

       ArrayList<Sensor> Slist = new ArrayList<>();
       ArrayList<Aktuator> Alist = new ArrayList<>();

        //create building

        Building b1 = new Building(u1, "tek",Slist,Alist);

        //create sensors

        Co2Sensor c1 = new Co2Sensor(25);

        //create actuators
        
        b1.addCo2Sensor(c1);



    }

}