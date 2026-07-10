package floracare;

public class Main {

    public static void main(String[] args) {

        Plant[] plants = {

                new FlowerPlant(
                        "F001",
                        "Rose",
                        90,
                        35,
                        "Red"
                ),

                new CactusPlant(
                        "C001",
                        "Golden Barrel",
                        180,
                        25,
                        150
                ),

                new TropicalPlant(
                        "T001",
                        "Monstera",
                        120,
                        50,
                        80
                )

        };

        System.out.println("========== FLORACARE ==========");

        for (Plant plant : plants) {

            plant.displayInfo();

            System.out.println();

        }

    }

}