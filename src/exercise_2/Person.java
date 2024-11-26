package exercise_2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // Метод для получения Фамилии и И.О.
    public String getShortName() {
        StringBuilder shortName = new StringBuilder();

        // Добавляем фамилию
        if (lastName != null && !lastName.isEmpty()) {
            shortName.append(lastName);
        }

        // Добавляем инициалы, если они существуют
        if (firstName != null && !firstName.isEmpty()) {
            shortName.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            shortName.append(middleName.charAt(0)).append(".");
        }

        return shortName.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Тестирование
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Сидоров", null, null);

        System.out.println(person1.getShortName()); // Иванов И.И.
        System.out.println(person2.getShortName()); // Петров П.
        System.out.println(person3.getShortName()); // Сидоров
    }
}

