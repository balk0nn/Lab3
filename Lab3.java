import java.util.Scanner;
import java.util.regex.*;

public class Lab3 {
    public static void main(String[] args) {
        String pattern = ("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])" +
                "(?=.*[A-Z])(?=\\S+$).*$");
        Scanner scan = new Scanner(System.in);
        String password = null;
        System.out.println("Введите пароль, и мы проверим," +
                " достаточно ли он надёжен. \n" +
                "Пароль считается надежным, если он содержит 8+ символов,\n" +
                "хотя бы одну цифру," +
                " хотя бы одну заглавную букву, и " +
                "хотя бы одну строчную букву.\n" +
                "Также пароль не может содержать символов пробел" +
                ", tab");
        password = scan.nextLine();
        scan.close();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if (m.matches()) {
            System.out.println("Ваш пароль достаточно надёжен");
        } else {
            System.out.println("Ваш пароль недостаточно надёжен");
        }
    }
}

