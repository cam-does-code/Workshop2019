import java.util.ArrayList;
import java.util.Scanner;

public class BuildingSystem {
private ArrayList<Building> buildings;

public BuildingSystem(){
    this.buildings = new ArrayList<>();
    play();
}

    private void play() {
        boolean finished = false;
        Scanner s = new Scanner(System.in);
        String command;
        System.out.printf("Welcome to the sensor/actuator system.%nAdd a building by typing 'add building'.%n" +
                "You can also see a list of all the buildings in the system by typing 'list buildings'");
        while (!finished) {
            System.out.println("please type a command");
            command = s.next().toLowerCase();
           if(command.equals("quit")) {
               finished = true;
           }
           else {
               //commandSwitch();
           }

        }

        }

public void addBuilding(){

}

//command
}
