package hw5;

public class Gruzovoy extends Ground{
    int gruzopodyom;  // Грузоподъёмность(т)

    Gruzovoy(int power, int max_speed, int weight, String model, int wheel_number, int rashod_topliva, int gruzopodyom) {
        super(power, max_speed, weight, model, wheel_number, rashod_topliva);
        this.gruzopodyom = gruzopodyom;
    }
    void displayInfo(){
        System.out.printf("Характеристики грузового наземного транспорта: \nМощность(в лошадиных силах): %s \n" +
                        "Мощность(в кВ): %s \nМаксимальная скорость(км/ч): %s \nМасса (кг): %s \nМарка: %s \n" +
                        "Количество колёс: %s \nРасход топлива(л/100км): %s \nГрузоподъёмность(т): %s \n\n",super.getPower(),power2(power),
                super.getMax_speed(),super.getWeight(),super.getModel(),super.getWheel_number(),super.getRashod_topliva(),
                gruzopodyom);
    }
    static double power2(int power){
        return power*0.74;
    }

    void gruzopodyom(double gruz){
        if (gruzopodyom >= gruz){
            System.out.println("Грузовик загружен!");
        }else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }
}
