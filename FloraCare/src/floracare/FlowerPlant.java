package floracare;

public class FlowerPlant extends Plant {

    private String flowerColor;
    private int fragranceLevel;

    public FlowerPlant(
        String id,
        String name,
        int age,
        double height,
        String flowerColor,
        int fragranceLevel) {

        super(id, name, age, height);

        this.flowerColor = flowerColor;
        this.fragranceLevel = fragranceLevel;
    }

    // Getter
    public String getFlowerColor() {
        return flowerColor;
    }
    
    public int getFragranceLevel() {
        return fragranceLevel;
    }

    // Setter
    public void setFlowerColor(String flowerColor) {

        if (!flowerColor.trim().isEmpty()) {
            this.flowerColor = flowerColor;
        }

    }
    
    public void setFragranceLevel(int fragranceLevel){

       if(fragranceLevel >= 1 && fragranceLevel <= 10){
        this.fragranceLevel = fragranceLevel;
        }

    }
    
    @Override
    public double calculateWaterNeed() {
        return 400 + (getHeight() * 2);
    }

    @Override
    public void displayInfo(){

        System.out.println("========== FLOWER PLANT ==========");

        super.displayInfo();

        System.out.println("Flower Color     : " + flowerColor);
        System.out.println("Fragrance Level  : " + fragranceLevel);

    }

}