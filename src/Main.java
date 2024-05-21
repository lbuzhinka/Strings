public class Main {
    public static void main(String[] args) {
      /*  String phone = "7-951-778-00-55";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
           // phone = '7' + phone;
        }
        else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Chtlb yfc gjcnjhjyybq");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "795170055";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }*/
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +  " " + firstName + " " +  middleName;
        System.out.println(fullName);
        System.out.println("\nTask 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);
        System.out.println("\nTask 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName3);
    }
}