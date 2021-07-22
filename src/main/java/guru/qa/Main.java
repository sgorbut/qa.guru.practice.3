package guru.qa;

public class Main {

    public static void main(String[] args) {

        Bicycle hardtail = new Bicycle();
        hardtail.colour = "black";
        hardtail.suspension = true;
        hardtail.wheelSize = 26;

        Bicycle roadBike = new Bicycle();

        System.out.println("Your old bike has " + roadBike.wheelSize + " wheel size and " + roadBike.colour + " colour.");
        System.out.println("You got a new bike.");
        Bicycle.numberOfWheels();
        System.out.println("It has " + hardtail.wheelSize + " wheel size, " + hardtail.suspension + " suspension and colour is:");
        System.out.println(hardtail.getColour());

    }

}
