package hw5;

public class Transport {
    int power;      // Мощность(в лошадиных силах)
    int max_speed;  // Максимальная скорость(км/ч)
    int weight;     // Масса (кг)
    String model;   // Марка

    public int getPower(){return power;}
    public int getMax_speed(){return max_speed;}
    public int getWeight(){return weight;}
    public String getModel(){return model;}

    public Transport(int power, int max_speed, int weight, String model){
        this.power = power;
        this.max_speed = max_speed;
        this.weight = weight;
        this.model = model;
    }
}
