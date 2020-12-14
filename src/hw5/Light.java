package hw5;

public class Light extends Ground{
    String tip_kuzova;  // Тип кузова
    int passengers;     // Кол-во пассажиров

    Light(int power, int max_speed, int weight, String model, int wheel_number, int rashod_topliva, String tip_kuzova, int passengers) {
        super(power, max_speed, weight, model, wheel_number, rashod_topliva);
        this.tip_kuzova = tip_kuzova;
        this.passengers = passengers;
    }
    void displayInfo(){
        System.out.printf("Характеристики легкового наземного транспорта: \nМощность(в лошадиных силах): %s \n" +
                        "Мощность(в кВ): %s \nМаксимальная скорость(км/ч): %s \nМасса (кг): %s \nМарка: %s \n" +
                        "Количество колёс: %s \nРасход топлива(л/100км): %s \nТип кузова: %s \nКол-во пассажиров: %s \n\n",
                super.getPower(),power2(power),super.getMax_speed(),super.getWeight(),super.getModel(),super.getWheel_number(),
                super.getRashod_topliva(),tip_kuzova,passengers);
    }
    static double power2(int power){
        return power*0.74;
    }

    void probeg(double time){
        System.out.printf("За время %s ч, автомобиль %s двигаясь с максимальной скоростью %s км/ч проедет %s км и " +
                "израсходует %s литров топлива.\n\n",time,super.model,super.max_speed,time*getMax_speed(),rashod(time));
    }
    private double rashod(double time){
        return time*getMax_speed()*getRashod_topliva()/100;
    }
}
