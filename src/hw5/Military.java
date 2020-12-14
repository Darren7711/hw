package hw5;

public class Military extends Air{
    boolean katapulta;  // Наличие системы катапультирования
    int rockets;        // Кол-во ракет на борту

    Military(int power, int max_speed, int weight, String model, int wingspan, int min_lenth_polosi,boolean katapulta, int rockets){
        super(power, max_speed, weight, model, wingspan, min_lenth_polosi);
        this.katapulta = katapulta;
        this.rockets = rockets;
    }
    void displayInfo(){
        System.out.printf("Характеристики военного воздушного транспорта: \nМощность(в лошадиных силах): %s \n" +
                        "Мощность(в кВ): %s \nМаксимальная скорость(км/ч): %s \nМасса (кг): %s \nМарка: %s \n" +
                        "Размах крыльев (м): %s \nМинимальная длина взлётно-посадочной полосы для взлёта (м): %s \n" +
                        "Наличие системы катапультирования: %s \nКол-во ракет на борту: %s \n\n",super.getPower(),power2(power),
                super.getMax_speed(),super.getWeight(),super.getModel(),super.getWingspan(),super.getMin_lenth_polosi(),
                katapulta,rockets);
    }
    static double power2(int power){
        return power*0.74;
    }

    void shot(){
        if (rockets > 0){
            System.out.println("Ракета пошла…");
        }else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }
    void katapulta_availability(){
        if (katapulta = true){
            System.out.println("Катапультирование прошло успешно!");
        }else {
            System.out.println("У вас нет такой системы.");
        }
    }
}
