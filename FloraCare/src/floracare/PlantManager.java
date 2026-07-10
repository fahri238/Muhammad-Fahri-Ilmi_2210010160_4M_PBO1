package floracare;

public class PlantManager {
    private Plant[] plants;
    private int totalPlant;
    public PlantManager(int capacity) {
        plants = new Plant[capacity];
        totalPlant = 0;
    }

    // Menambah tanaman
    public void addPlant(Plant plant) {
        if (totalPlant < plants.length) {
            plants[totalPlant] = plant;
            totalPlant++;
            System.out.println("Plant added successfully.");
        } else {
            System.out.println("Storage is full!");
        }
    }

    // Menampilkan semua tanaman
    public void displayAllPlants() {
        if (totalPlant == 0) {
            System.out.println("No plant data available.");
            return;
        }
        System.out.println("========== PLANT LIST ==========");
        for (int i = 0; i < totalPlant; i++) {
            plants[i].displayInfo();
            System.out.println();
        }
    }

    // Mencari tanaman berdasarkan ID
    public Plant searchPlant(String id) {
        for (int i = 0; i < totalPlant; i++) {
            if (plants[i].getId().equalsIgnoreCase(id)) {
                return plants[i];
            }
        }
        return null;
    }
    
    // rencana tanaman (penyiraman)
    public void waterPlant(String id){
        Plant plant = searchPlant(id);
        if(plant != null){
            plant.waterPlant();
            System.out.println("Plant has been watered.");
        }else{
            System.out.println("Plant not found.");
        }
    }
    
    // plant height update
    public void growPlant(String id, double growth){
        Plant plant = searchPlant(id);
        if(plant != null){
            plant.grow(growth);
            System.out.println("Plant height updated.");
        }else{
            System.out.println("Plant not found.");
        }
    }
    
    public void addPlantFromInput(InputHelper input){
    System.out.println("Choose Plant Type");
    System.out.println("1. Flower Plant");
    System.out.println("2. Cactus Plant");
    System.out.println("3. Tropical Plant");

    int choice = input.inputInt("Choice : ");
    String id = input.inputString("ID : ");
    String name = input.inputString("Name : ");
    int age = input.inputInt("Age : ");
    double height = input.inputDouble("Height : ");

    Plant plant = null;

    switch(choice){


        case 1:
            String color =
                    input.inputString("Flower Color : ");
            int fragrance =
                    input.inputInt("Fragrance Level (1-10) : ");
            plant = new FlowerPlant(
                    id,
                    name,
                    age,
                    height,
                    color,
                    fragrance
            );
            break;

        case 2:
            int thorn =
                    input.inputInt("Thorn Count : ");
            int indoor =
                    input.inputInt("Indoor? (1 Yes / 0 No) : ");

            plant = new CactusPlant(
                    id,
                    name,
                    age,
                    height,
                    thorn,
                    indoor == 1
            );
            break;



        case 3:
            int humidity =
                    input.inputInt("Humidity Level : ");
            double leaf =
                    input.inputDouble("Leaf Width : ");
            plant = new TropicalPlant(
                    id,
                    name,
                    age,
                    height,
                    humidity,
                    leaf
            );
            break;
        default:
            System.out.println("Invalid plant type.");
            return;
    }
    addPlant(plant);
}
}