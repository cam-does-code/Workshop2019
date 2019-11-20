
public class Actuator {
    private Building building;
    private String ActuatorID;

    public Actuator(String ActuatorID){
        this.ActuatorID = ActuatorID;
    }

    public String getActuatorID() {
        return ActuatorID;
    }

    public void setActuatorID(String actuatorID) {
        ActuatorID = actuatorID;
    }

    public void windowIsOpen() {
        int x = building.getCO2Level();
        if (x > 25 ) {
            System.out.println("The CO2 level is " + x + "% so the window is open now");
        }
        else{
            System.out.println("window is closed. The CO2 level is "+ x +"%");
        }


    }

}
