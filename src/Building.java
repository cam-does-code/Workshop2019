import java.util.*;

public class Building {
    private String buildingID;
    private int co2level;
    private boolean windownsOpen;
    private ArrayList<String> actuators;


    public Building(String buildingID, int co2level, boolean windownsOpen, ArrayList<String> actuators) {
        this.buildingID = buildingID;
        this.co2level = co2level;
        this.windownsOpen = windownsOpen;
        this.actuators = actuators;
    }

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public int getCo2level() {
        return co2level;
    }

    public void setCo2level(int co2level) {
        this.co2level = co2level;
    }

    public boolean isWindownsOpen() {
        return windownsOpen;
    }

    public void setWindownsOpen(boolean windownsOpen) {
        this.windownsOpen = windownsOpen;
    }

    public ArrayList<String> getActuators() {
        return actuators;
    }

    public void setActuators(ArrayList<String> actuators) {
        this.actuators = actuators;
    }

}