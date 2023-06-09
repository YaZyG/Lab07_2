import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        // Додавання контактів
        phoneBook.addContact("Лопачак", "+380991234512");
        phoneBook.addContact("Гоба", "+380992345613");
        phoneBook.addContact("Рижий", "+380993456714");
        phoneBook.addContact("Пісоцький", "+380993456715");
        phoneBook.addContact("Войтович", "+380993456716");
        phoneBook.addContact("Канціч", "+380991234517");
        phoneBook.addContact("Мандзяк", "+380992345618");
        phoneBook.addContact("Ваверчак", "+380993456719");
        phoneBook.addContact("Сущик", "+380993456721");
        // Виведення всіх контактів
        System.out.println("Телефонна книга :");
        phoneBook.printPhoneBook();
        // Пошук номеру за прізвищем
        System.out.print("\nВведіть прізвище для пошуку номеру: ");
        String searchLastName = scanner.nextLine();
        String phoneNumber = phoneBook.getPhoneNumber(searchLastName);
        if (phoneNumber != null) {
            System.out.println("Номер телефону для прізвища " + searchLastName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + searchLastName);
        }
        // Видалення контакту
        System.out.print("\nВведіть прізвище контакту для видалення: ");
        String lastNameToRemove = scanner.nextLine();
        phoneBook.removeContact(lastNameToRemove);
        System.out.println("Контакт " + lastNameToRemove + " видалений з книги.");

        System.out.println("\nТелефонна книга:");
        phoneBook.printPhoneBook();

        // Додавання нового контакту
        System.out.print("\nДодавання нового контакту\n");
        System.out.print("Введіть прізвище: ");
        String newLastName = scanner.nextLine();
        System.out.print("Введіть номер телефону: ");
        String newPhoneNumber = scanner.nextLine();
        phoneBook.addContact(newLastName, newPhoneNumber);
        System.out.println("Контакт " + newLastName + " доданий до книги.");

        System.out.println("\nТелефонна книга:");
        phoneBook.printPhoneBook();

        // Кількість записів у книзі
        int size = phoneBook.getSize();
        System.out.println("\nКількість записів у книзі: " + size);

        scanner.close();
    }
}