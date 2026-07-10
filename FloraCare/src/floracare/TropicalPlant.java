package floracare;

public class TropicalPlant extends Plant {

    private int humidityLevel;
    private double leafWidth;
    
    public TropicalPlant(
            String id,
            String name,
            int age,
            double height,
            int humidityLevel,
            double leafWidth) {

        super(id, name, age, height);

        this.humidityLevel = humidityLevel;
        this.leafWidth = leafWidth;
    }

    public int getHumidityLevel() {
        return humidityLevel;
    }
    
    public double getLeafWidth(){
        return leafWidth;
    }

    public void setHumidityLevel(int humidityLevel) {
        if (humidityLevel >= 0 && humidityLevel <= 100) {
            this.humidityLevel = humidityLevel;
        }
    }
    
    public void setLeafWidth(double leafWidth){
        if(leafWidth > 0){
            this.leafWidth = leafWidth;
        }
    }

    @Override
    public double calculateWaterNeed() {

        return 600 + (getHeight() * 3);

    }

    @Override
    public void displayInfo(){

        System.out.println("========== TROPICAL PLANT ==========");

        super.displayInfo();

        System.out.println("Humidity Level : " + humidityLevel);
        System.out.println("Leaf Width     : " + leafWidth + " cm");

    }

}