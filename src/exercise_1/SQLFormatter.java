package exercise_1;

import java.util.Scanner;

public class SQLFormatter {
    private static final String sqlQuery = "INSERT INTO T_GroupSelected (id_Student, firstName, lastName, id_Group)\n" +
            "    SELECT id_Student, firstName, lastName, id_Group\n" +
            "    FROM T_Student\n" +
            "    WHERE id_Group = '%s' AND dolgCount > %s;";
    public static String createSqlQuery(String group, int dolgCount){
        return String.format(sqlQuery, group, dolgCount);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите наименование группы: ");
        String group = sc.nextLine();
        System.out.println("Введите количество долгов: ");
        int dolgCount = sc.nextInt();
        System.out.println(createSqlQuery(group, dolgCount));
    }
}
