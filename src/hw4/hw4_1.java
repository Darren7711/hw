package hw4;

public class hw4_1 {
        public static void main(String[] args) {
            pc my_pc = new pc("Intel Core i5","4 Gb","100 Tb");
            my_pc.displayInfo();
            my_pc.turnON(1, 3);
            my_pc.turnOFF(1);
        }
    }
