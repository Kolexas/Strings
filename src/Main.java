public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        // Задание 2
        String UpCase = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчёта - " + UpCase);
        // Задание 3
        String firstName2 = "Семён ";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов ";
        String fullName2 = lastName2 + firstName2 + middleName2;
        String redacted = fullName2.replace('ё','е');
        System.out.println("Данные Ф.И.О сотрудника - " + redacted);
    }
}