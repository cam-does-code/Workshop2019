import java.util.Random;
import java.lang.Math.*;

public class Sensor {

    private String SensorID;

    public int getTemp(int temp) {
        int max = 50;
        int min = 1;
        int range = max-min+1;


        int random = (int) Math.random() * range;

        temp = random;

        return temp;

    }

    public int getCO2Level(int level) {
        int min = 10;
        int max = 60;
        int range = max-min+1;

        int random = (int) Math.random() * range;

        level = random;

        return level;
    }

}
