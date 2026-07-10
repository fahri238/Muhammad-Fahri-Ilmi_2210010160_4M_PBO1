package floracare;

public class CactusPlant extends Plant {

    private int thornCount;
    private boolean indoor;

    public CactusPlant(
            String id,
            String name,
            int age,
            double height,
            int thornCount,
            boolean indoor) {
        super(id, name, age, height);
        this.thornCount = thornCount;
        this.indoor = indoor;
    }

    public int getThornCount() {
        return thornCount;
    }
    
    public boolean isIndoor(){
       return indoor;
    }

    public void setThornCount(int thornCount) {
        if (thornCount >= 0) {
            this.thornCount = thornCount;
        }
    }
    
    public void setIndoor(boolean indoor){
       this.indoor = indoor;
    }

    @Override
    public double calculateWaterNeed() {
        return 80 + (getAge() * 0.2);
    }

    @Override
    public void displayInfo(){

        System.out.println("========== CACTUS PLANT ==========");

        super.displayInfo();

        System.out.println("Thorn Count : " + thornCount);
        System.out.println("Indoor      : " + (indoor ? "Yes" : "No"));

    }
}