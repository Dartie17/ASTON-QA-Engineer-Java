// Задание 3

public class Park {
    static class Attraction {
        String name;
        String time;
        double price;

        Attraction(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        void showInfo() {
            System.out.println("Name: " + name + "\nTime: " + time + "\nPrice: " + price);
        }
    }
}
