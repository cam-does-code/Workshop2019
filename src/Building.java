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

    public void GetActuatorList() {
        System.out.println(actuators);
    }

    public void GetSensorList() {
        System.out.println(sensors);
    }

    public void removeActuator(Actuator actuator) {
        actuators.remove(actuator);
    }

    public void addActuator(Actuator actuator) {
        actuators.add(actuator);
    }

    public void removeSensor(Sensor sensor) {
        sensors.remove(sensor);
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }
}

