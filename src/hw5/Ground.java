package hw5;

public class Ground extends Transport{
    int wheel_number;    // Количество колёс
    int rashod_topliva;  // Расход топлива(л/100км)

    public int getWheel_number(){return wheel_number;}
    public int getRashod_topliva(){return rashod_topliva;}

    Ground(int power, int max_speed, int weight, String model, int wheel_number, int rashod_topliva){
        super(power, max_speed, weight, model);
        this.wheel_number = wheel_number;
        this.rashod_topliva = rashod_topliva;
    }
}
