package guru.qa;

public class Bicycle {

    String colour = "orange";
    int wheelSize = 28;
    boolean suspension = false;

    String getColour (){
        return colour;
    }

    void setWheelSize (int wheelSize) {
        this.wheelSize = wheelSize;
        }

        // Статический метод
    static void numberOfWheels(){
            System.out.println("Your bike has 2 wheels.");
        }
}
