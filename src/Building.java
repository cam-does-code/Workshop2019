import java.util.*;

public class Building {
    private boolean windowsOpen;
    private String buildingID;
    private int co2level;
    private int temp;
    private ArrayList<String> actuators;


    public Building(String buildingID, int co2level, boolean windowsOpen, ArrayList<String> actuators) {
        this.buildingID = buildingID;
        this.co2level = co2level;
        this.windowsOpen = windowsOpen;
        this.actuators = actuators;
    }

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public boolean isWindownsOpen() {
        return windowsOpen;
    }

    public void setWindownsOpen(boolean windowsOpen) {
        this.windowsOpen = windowsOpen;
    }

    public ArrayList<String> getActuators() {
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