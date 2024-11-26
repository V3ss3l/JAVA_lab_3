package exercise_3;

public class AddressTest {
    public static void main(String[] args) {
        // Примеры адресов
        String address1 = "Россия, Москва, Москва, Тверская, 12, 1, 101";
        String address2 = "США; Калифорния; Лос-Анджелес; Сансет-бульвар; 15; 2; 305";
        String address3 = "Франция. Иль-де-Франс. Париж. Елисейские Поля. 10. 3. 501";
        String address4 = "Германия- Бавария- Мюнхен- Карлштрассе- 22- 4- 203";

        Address address = new Address();

        // Тестирование метода split()
        System.out.println("Тест с использованием split():");
        address.parseAddressWithSplit(address1);
        System.out.println(address);

        // Тестирование метода StringTokenizer
        System.out.println("\nТест с использованием StringTokenizer:");
        address.parseAddressWithTokenizer(address2);
        System.out.println(address);

        address.parseAddressWithTokenizer(address3);
        System.out.println(address);

        address.parseAddressWithTokenizer(address4);
        System.out.println(address);
    }
}
