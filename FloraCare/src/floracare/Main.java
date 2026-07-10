package floracare;

public class Main {

    public static void main(String[] args) {

        InputHelper input = new InputHelper();

        String id = input.inputString("Plant ID : ");

        String name = input.inputString("Plant Name : ");

        int age = input.inputInt("Plant Age : ");

        double height = input.inputDouble("Plant Height : ");

        FlowerPlant flower = new FlowerPlant(

                id,

                name,

                age,

                height,

                "Red"

        );

        flower.displayInfo();

    }

}