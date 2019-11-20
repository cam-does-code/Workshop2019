import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildingSystem {
private List<Building> buildings;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Building ID:");

        String buildingName = scanner.nextLine();
        buildings.add(new Building(buildingName));
        System.out.println(buildingName + " has been added to the system");


    }

    public void removeBuilding(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which building to remove?");

        String buildingName = scanner.nextLine();
        for (Building name : buildings) {
        if (buildingName.equals(name.getBuildingID())){
            buildings.remove(buildingName);
            System.out.println(buildingName + " has been removed from the system.");
        }
        else {
            System.out.println("That building is not in the system");}
        }
    }

    public List<Building> getBuildings(){
        return buildings;
    }

}
