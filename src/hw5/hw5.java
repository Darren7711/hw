package hw5;

public class hw5 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen(1139,650,102563,"Boeing 747",46,2050,
                650,true);
        Military military = new Military(702,1600,23520,"Ghost 3000",19,615,
                true,4);
        Light light = new Light(1000,320,4620,"Volvo S90",4,15,
                "Седан",5);
        Gruzovoy gruzovoy = new Gruzovoy(500,220,6750,"МАЗ 105",6,23,42);

        citizen.displayInfo();
        military.displayInfo();
        light.displayInfo();
        gruzovoy.displayInfo();
        light.probeg(3.5);
        gruzovoy.gruzopodyom(16.12);
        citizen.passenger_capacity(798);
        military.shot();
        military.katapulta_availability();
    }
}
