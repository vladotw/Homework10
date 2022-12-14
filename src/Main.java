public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println();
        System.out.println();
    }

    public static void task2() {

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";

        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameCapital = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCapital);

        System.out.println();
        System.out.println();
    }

    public static void task3() {

        String fullName = "Иванов Семён Семёнович";

        String fullNameCorrected = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника — " + fullNameCorrected);
    }

}