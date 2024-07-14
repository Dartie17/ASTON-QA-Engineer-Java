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

    public void run(int dist) {
        System.out.println(name + " пробежал " + dist + " м");
    }

    public void swim(int dist) {
        System.out.println(name + " проплыл " + dist + " м");
    }


    // Наследуемый класс "Cat"
    public class Cat extends Animal {
        String color;

        public Cat(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public void catInfo() {
            System.out.println("Name: " + name + "\nColor: " + color);
        }


    }



}
