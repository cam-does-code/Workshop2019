import java.util.*;

public class Building {
    private String buildingID;
    private List<Actuator> actuators;
    private List<Sensor> sensors;
    private int temp;
    private int co2;


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

    public void removeSensor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which sensor to remove?");

        String sensorName = scanner.nextLine();
        for (Sensor name : sensors) {
            if (sensorName.equals(name.getSensorID())) {
                sensors.remove(sensorName);
                System.out.println(sensorName + " has been removed from the building.");
            } else {
                System.out.println("That sensor is not in the building");
            }
        }
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

    public void removeActuator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which actuator to remove?");

        String actuatorName = scanner.nextLine();
        for (Actuator name : actuators) {
            if (actuatorName.equals(name.getActuatorID())) {
                actuators.remove(actuatorName);
                System.out.println(actuatorName + " has been removed from the building.");
            } else {
                System.out.println("That building is not in the system");
            }
        }
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

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }
}