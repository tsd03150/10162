import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = {300, 60, 10};
        int[] button = new int[3];

        for (int i = 0; i < arr.length; i++) {
            button[i] = n / arr[i];
            n %= arr[i];
        }

        if (n != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < button.length; i++) {
                System.out.print(button[i] + " ");
            }
        }

    }
}
