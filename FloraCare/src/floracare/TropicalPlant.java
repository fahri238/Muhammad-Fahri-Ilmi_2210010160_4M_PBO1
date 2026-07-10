package floracare;

public class TropicalPlant extends Plant {

    private int humidityLevel;

    public TropicalPlant(
            String id,
            String name,
            int age,
            double height,
            int humidityLevel) {

        super(id, name, age, height);

        this.humidityLevel = humidityLevel;
    }

    public int getHumidityLevel() {
        return humidityLevel;
    }

    public void setHumidityLevel(int humidityLevel) {

        if (humidityLevel >= 0 && humidityLevel <= 100) {

            this.humidityLevel = humidityLevel;

        }

    }

    @Override
    public double calculateWaterNeed() {

        return 600 + (getHeight() * 3);

    }

    @Override
    public void displayInfo() {

        System.out.println("========== TROPICAL PLANT ==========");

        super.displayInfo();

        System.out.println("Humidity     : " + humidityLevel + "%");

    }

}