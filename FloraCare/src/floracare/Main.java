package floracare;

public class Main {

    public static void main(String[] args) {
        PlantManager manager = new PlantManager(100);
        InputHelper input = new InputHelper();
        boolean running = true;
        
        while(running){
            Menu.showMenu();
            int choice = input.inputInt("Choose menu : ");
            switch(choice){
                case 1:
                    System.out.println("Feature will be implemented next commit.");
                    break;
                    
                case 2:
                    manager.displayAllPlants();
                    break;

                case 3:
                    String id = input.inputString("Input Plant ID : ");
                    Plant plant = manager.searchPlant(id);
                    if(plant != null){
                        plant.displayInfo();
                    }else{
                        System.out.println("Plant not found.");
                    }
                    break;

                case 4:
                    id = input.inputString("Input Plant ID : ");
                    manager.waterPlant(id);
                    break;
                    
                case 5:
                    id = input.inputString("Input Plant ID : ");
                    double growth = input.inputDouble("Additional Height : ");
                    manager.growPlant(id, growth);
                    break;
                    
                case 6:
                    running = false;
                    System.out.println("Thank you for using FloraCare.");
                    break;
                    
                default:
                    System.out.println("Invalid menu.");
            }
        }
    }
}