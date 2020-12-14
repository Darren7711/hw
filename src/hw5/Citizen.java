package hw5;

public class Citizen extends Air{
    int passengers;    //  Кол-во пассажиров
    boolean business;  // Наличие бизнес класса

    Citizen(int power, int max_speed, int weight, String model, int wingspan, int min_lenth_polosi, int passengers, boolean business) {
        super(power, max_speed, weight, model, wingspan, min_lenth_polosi);
        this.passengers = passengers;
        this.business = business;
    }

    void displayInfo(){
        System.out.printf("Характеристики гражданского воздушного транспорта: \nМощность(в лошадиных силах): %s \n" +
                        "Мощность(в кВ): %s \nМаксимальная скорость(км/ч): %s \nМасса (кг): %s \nМарка: %s \nРазмах крыльев (м): %s \n" +
                        "Минимальная длина взлётно-посадочной полосы для взлёта (м): %s \nКол-во пассажиров: %s \nНаличие бизнес класса: %s \n\n",
                super.getPower(),power2(power),super.getMax_speed(),super.getWeight(),super.getModel(),super.getWingspan(),
                super.getMin_lenth_polosi(), passengers,business);
    }
    static double power2(int power){
        return power*0.74;
    }

    void passenger_capacity(int people){
        if (passengers >= people){
            System.out.println("Самолет загружен!");
        }else {
            System.out.println("Вам нужен самолет побольше.");
        }
    }
}
