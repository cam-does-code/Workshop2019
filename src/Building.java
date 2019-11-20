import java.util.*;

public class Building {
    private String buildingID;
    private List<Building> actuators;
    private List<Sensor> sensors;


    public Building(String buildingID) {
        this.buildingID = buildingID;
        this.actuators = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public void addSensor(){
        System.out.println("Enter new SensorID");


    }
    public List<Sensor> getSensors(){

        return sensors;
    }

    public List<Building> getActuators() {
        return actuators;
    }
    public int getTemp() {
        return getRandomIntegerWithinRange(1, 50);
    }

    public int getCO2Level() {
        return getRandomIntegerWithinRange(10, 60);
    }

    private static int getRandomIntegerWithinRange(int min, int max) {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}