package floracare;

public class CactusPlant extends Plant {

    private int thornCount;

    public CactusPlant(
            String id,
            String name,
            int age,
            double height,
            int thornCount) {
        super(id, name, age, height);
        this.thornCount = thornCount;
    }

    public int getThornCount() {
        return thornCount;
    }

    public void setThornCount(int thornCount) {
        if (thornCount >= 0) {
            this.thornCount = thornCount;
        }

    }

    @Override
    public double calculateWaterNeed() {
        return 80 + (getAge() * 0.2);
    }

    @Override
    public void displayInfo() {
        System.out.println("========== CACTUS PLANT ==========");
        super.displayInfo();
        System.out.println("Thorn Count  : " + thornCount);
    }
}