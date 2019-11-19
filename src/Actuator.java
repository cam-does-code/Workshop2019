
public class Actuator {
    private Building building;

    private String ActuatorID;
    private boolean isOpen = false;

    public void windowIsOpen() {
        int x = building.getCO2Level();
        if (x > 25 ) {
            isOpen = true;
            System.out.println("The CO2 level is " + x + "% so the window is open now");
        }
        else{
            System.out.println("window is closed. The CO2 level is "+ x +"%");
        }


    }

}
