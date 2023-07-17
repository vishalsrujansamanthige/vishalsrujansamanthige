import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        printOdd();
    }

    private static void printOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputNo = scanner.nextInt();
        scanner.close();
        int odd = 1;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        if (inputNo > 1) {
            for (int i = 0; i < inputNo-1; i++) {

                odd = odd + 2;
                integerList.add(odd);
            }
        }
        System.out.println(integerList.toString());
    }


}

