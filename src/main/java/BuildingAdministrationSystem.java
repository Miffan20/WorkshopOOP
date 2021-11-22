import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BuildingAdministrationSystem{

    List<Building> buildings;

//constructor
    public BuildingAdministrationSystem() {
        buildings= new ArrayList<Building>();
}

//metode
    public List<Building> getBuildings() {
        return buildings;
    }
    public void addBuilding(Building name){

        buildings.add(name);
    }

    public void removeBuilding(UUID id){
        buildings.remove(id);
    }



}
