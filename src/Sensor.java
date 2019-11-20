import java.util.Random;
import java.lang.Math.*;

public class Sensor {

    private String SensorID;

    public Sensor(String sensorID) {
        SensorID = sensorID;
    }

    public String getSensorID() {
        return SensorID;
    }

    public void setSensorID(String sensorID) {
        SensorID = sensorID;
    }
}
