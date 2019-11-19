public class Actuator {

    private String ActuatorID;
    private boolean isOpen;

    public void windowIsOpen() {
        if (getTemp > 25) {
            isOpen = true;

            System.out.println("The temperature is " + getTemp + " so the window is open now");

        }


    }

}
