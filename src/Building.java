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

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public void addSensor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Sensor ID:");

        String sensorName = scanner.nextLine();
        System.out.println("The sensor " + sensorName + " has been added to " + this.buildingID);
        sensors.add(new Sensor(sensorName));



    }
    public List<Sensor> getSensors(){
        return sensors;
    }

    public void addActuator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Actuator ID:");

        String actuatorName = scanner.nextLine();
        System.out.println("The actuator " + actuatorName + " has been added to " + this.buildingID);
        actuators.add(new Actuator(actuatorName));
    }

    public List<Actuator> getActuators() {
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