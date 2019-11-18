import java.util.ArrayList;
import java.util.List;

public class System {
    private List<Building> buildings;

    public System() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);

    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public void GetList() {
        System.out.println(buildings);
    }
}
