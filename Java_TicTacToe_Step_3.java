package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] ticTac = input.toCharArray();
        String verdict;
        if (ticTac[0] == 'X' & ticTac[1] == 'X' & ticTac[2] == 'X' ||
            ticTac[3] == 'X' & ticTac[4] == 'X' & ticTac[5] == 'X' ||
            ticTac[6] == 'X' & ticTac[7] == 'X' & ticTac[8] == 'X' ||
            ticTac[0] == 'X' & ticTac[3] == 'X' & ticTac[6] == 'X' ||
            ticTac[1] == 'X' & ticTac[4] == 'X' & ticTac[7] == 'X' ||
            ticTac[2] == 'X' & ticTac[5] == 'X' & ticTac[8] == 'X' ||
            ticTac[0] == 'X' & ticTac[4] == 'X' & ticTac[8] == 'X' ||
            ticTac[2] == 'X' & ticTac[4] == 'X' & ticTac[6] == 'X'
        ) {
            verdict = "X wins";
        } else if (ticTac[0] == 'O' & ticTac[1] == 'O' & ticTac[2] == 'O' ||
                ticTac[3] == 'O' & ticTac[4] == 'O' & ticTac[5] == 'O' ||
                ticTac[6] == 'O' & ticTac[7] == 'O' & ticTac[8] == 'O' ||
                ticTac[0] == 'O' & ticTac[3] == 'O' & ticTac[6] == 'O' ||
                ticTac[1] == 'O' & ticTac[4] == 'O' & ticTac[7] == 'O' ||
                ticTac[2] == 'O' & ticTac[5] == 'O' & ticTac[8] == 'O' ||
                ticTac[0] == 'O' & ticTac[4] == 'O' & ticTac[8] == 'O' ||
                ticTac[2] == 'O' & ticTac[4] == 'O' & ticTac[6] == 'O'
        ){
            verdict = "O wins";
        } else if (ticTac[0] == '_' || ticTac[1] == '_' || ticTac[2] == '_' ||
                ticTac[3] == '_' || ticTac[4] == '_' || ticTac[5] == '_' ||
                ticTac[6] == '_' || ticTac[7] == '_' || ticTac[8] == '_'
        ){
            verdict = "Game not finished";
        } else {
            verdict = "Draw";
        }

        System.out.println("---------" +
                "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                "\n---------" +
                "\n" + verdict);

    }
}
