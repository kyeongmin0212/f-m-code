import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;

        while (true) {
            System.out.print("아기사자 인원 수를 입력하세요(최소 5명): ");
            count = sc.nextInt();
            sc.nextLine();

            if (count >= 5) {
                break;
            } else {
                System.out.println("5명 미만은 입력할 수 없습니다. 다시 입력해주세요.");
            }
        }

        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 이름 입력: ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n최종 아기사자 명단");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        sc.close();
    }
}