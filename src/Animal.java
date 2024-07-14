public class Animal {
    String name;

    // Конструктор без аргументов
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    private void run(int dist) {
        System.out.println(name + " пробежал " + dist + " м");
    }

    private void swim(int dist) {
        System.out.println(name + " проплыл " + dist + " м");
    }


    // Наследуемый класс "Cat"
    public class Cat extends Animal {

        public Cat(String name) {
            this.name = name;
        }

        public void catInfo() {
            System.out.println("Name: " + name);
        }

        public void run(int distance) {
            if (0 < distance && distance <= 150) {
                System.out.println(name + " пробежал " + distance + " м");
            }
        }


    }



}
