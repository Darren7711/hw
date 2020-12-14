package hw4;

class pc {
    String processor;
    String ram;
    String hd;
    int limit;
    static int count = 1;

    pc(String processor, String ram, String hd){
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
        count++;
    }

    void displayInfo(){
        System.out.println("Процессор: "+processor);
        System.out.println("Оперативная память: "+ram);
        System.out.println("Жесткий диск: "+hd);
    }

    public void turnON(int a, int limit) {
        int random = (int) (Math.random() * 2);
        System.out.println();
        System.out.println("Метод ВКЛ.:");
        System.out.println("рандомное число = " + random);
            if (a == random && count < limit) {
                System.out.println("Компьютер включен!");
            } else {
                System.out.println("Компьютер сгорел!");
            }
    }

    void turnOFF(int a){
        int random = (int)(Math.random()*2);
        System.out.println();
        System.out.println("Метод ВЫКЛ.:");
        System.out.println("рандомное число = "+random);
        if (a != random){
            System.out.println("Компьютер выключен!");
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }
}
