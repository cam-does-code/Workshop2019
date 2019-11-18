import java.util.*;

public class Building {
    private String buildingID;

    private List<Actuator> actuators;
    private List<Sensor> sensors;

    public Building(String buildingID) {
        this.buildingID = buildingID;
        this.actuators = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

}
