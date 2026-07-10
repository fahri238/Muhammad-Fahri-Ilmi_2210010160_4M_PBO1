package floracare;

public class FlowerPlant extends Plant {

    private String flowerColor;

    public FlowerPlant(
            String id,
            String name,
            int age,
            double height,
            String flowerColor) {

        super(id, name, age, height);

        this.flowerColor = flowerColor;
    }

    // Getter
    public String getFlowerColor() {
        return flowerColor;
    }

    // Setter
    public void setFlowerColor(String flowerColor) {

        if (!flowerColor.trim().isEmpty()) {
            this.flowerColor = flowerColor;
        }

    }
    
    @Override
    public double calculateWaterNeed() {
        return 400 + (getHeight() * 2);
    }

    @Override
    public void displayInfo() {

        System.out.println("========== FLOWER PLANT ==========");

        super.displayInfo();

        System.out.println("Flower Color : " + flowerColor);

    }

}