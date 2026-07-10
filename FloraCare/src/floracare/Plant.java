package floracare;

public class Plant {

    // ==========================
    // Attributes (Encapsulation)
    // ==========================
    private String id;
    private String name;
    private int age;
    private double height;
    private boolean watered;

    // ==========================
    // Constructor
    // ==========================
    public Plant(String id, String name, int age, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.watered = false;
    }

    // ==========================
    // Accessor (Getter)
    // ==========================
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isWatered() {
        return watered;
    }

    // ==========================
    // Mutator (Setter)
    // ==========================
    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public void setWatered(boolean watered) {
        this.watered = watered;
    }

    // ==========================
    // Method
    // ==========================

    public void waterPlant() {
        watered = true;
    }

    public void grow(double additionalHeight) {

        if (additionalHeight > 0) {
            height += additionalHeight;
        }

    }
    
    public double calculateWaterNeed() {
        return 300;
    }

    public void displayInfo() {

    System.out.println("------------------------------");
    System.out.println("Plant ID      : " + id);
    System.out.println("Plant Name    : " + name);
    System.out.println("Plant Age     : " + age + " days");
    System.out.println("Plant Height  : " + height + " cm");
    System.out.println("Water Status  : " + (watered ? "Watered" : "Not Watered"));

    System.out.println("Water Need    : " + calculateWaterNeed() + " ml/day");

}

}