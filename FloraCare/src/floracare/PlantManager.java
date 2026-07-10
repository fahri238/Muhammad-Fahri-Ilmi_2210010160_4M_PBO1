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
}