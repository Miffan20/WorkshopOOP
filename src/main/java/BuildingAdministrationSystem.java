import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BuildingAdministrationSystem extends Building{

    List<Building> buildings;

//constructor
    public BuildingAdministrationSystem(List<Building> buildings) {
        this.buildings = buildings;
        buildings= new ArrayList<Building>();
}

//metode
    public List<Building> getBuildings() {
        return buildings;
    }
    public UUID addBuilding(Building name){
        buildings.add(name);
    }

    public void removeBuilding(UUID id){
        buildings.remove(id);
    }
}
