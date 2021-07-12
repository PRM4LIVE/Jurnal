
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList<Scanner>();
        List number = new ArrayList<Integer>();
        int b = 0;

        System.out.println("Укажите количество учеников класса:");
        int a = scanner.nextInt();
        System.out.println("Введите фамилию ученика и его оценку:");
        for (int i = 0; i < a; i++) {
            String enter = scanner.next();
            list.add(enter);
            String num = scanner.next();
            number.add(num);
        }
        System.out.println(list);
        System.out.println(number);
    }
}
