public class Main {
    public static void main(String[] args) {

        // Задание 2
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Alekseev Aleksei Alekseevich", "Lawyer", "alekseev_aa@test.ru", "8(925)123-45-67", 185_000, 35);
        empArray[1] = new Employee("Ivanov Ivan Ivanovich", "QA-Engineer", "ivanov_ii@test.ru", "8(926)756-12-01", 140_000, 29);
        empArray[2] = new Employee("Semenov Semen Semenovich", "CEO", "semenov_ss@test.ru", "8(917)854-10-78", 480_000, 51);
        empArray[3] = new Employee("Petrov Petr Petrovich", "Manager", "petrov_pp@test.ru", "8(916)325-42-17", 210_000, 38);
        empArray[4] = new Employee("Sidorov Sidor Sidorovich", "HR", "sidorov_ss@test.ru", "8(926)032-28-97", 165_000, 31);

        for (var employee : empArray) {
            employee.showInfo();
            System.out.println();
        }
    }
}