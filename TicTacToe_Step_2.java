package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] ticTac = input.toCharArray();
        System.out.println("---------" +
                "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                "\n---------");
    }
}
