package hw5;

public class Air extends Transport{
    int wingspan;          // Размах крыльев (м)
    int min_lenth_polosi;  // Минимальная длина взлётно-посадочной полосы для взлёта (м)

    public int getWingspan(){return wingspan;}
    public int getMin_lenth_polosi(){return min_lenth_polosi;}

    public Air(int power, int max_speed, int weight, String model, int wingspan, int min_lenth_polosi){
        super(power, max_speed, weight, model);
        this.wingspan = wingspan;
        this.min_lenth_polosi = min_lenth_polosi;
    }
}
