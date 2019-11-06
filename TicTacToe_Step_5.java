package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean gameOn = true;
        String verdict = "";
        int xCount = 0;
        int oCount = 0;
        int turn = 0;

        char[] ticTac = "_________".toCharArray();
        System.out.println("---------" +
                "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                "\n---------" +
                "\n");



        while (gameOn == true){
            System.out.println("Enter the coordinates: ");
            String coordinate = scanner.nextLine();
            switch (coordinate) {
                case "1 3":
                    if (ticTac[0] == 'X' || ticTac[0] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[0] = 'O';
                        turn++;
                    } else {
                        ticTac[0] = 'X';
                        turn++;
                    }
                    break;
                case "1 2":
                    if (ticTac[3] == 'X' || ticTac[3] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[3] = 'O';
                        turn++;
                    } else {
                        ticTac[3] = 'X';
                        turn++;
                    }
                    break;
                case "1 1":
                    if (ticTac[6] == 'X' || ticTac[6] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[6] = 'O';
                        turn++;
                    } else {
                        ticTac[6] = 'X';
                        turn++;
                    }
                    break;
                case "2 3":
                    if (ticTac[1] == 'X' || ticTac[1] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[1] = 'O';
                        turn++;
                    } else {
                        ticTac[1] = 'X';
                        turn++;
                    }
                    break;
                case "2 2":
                    if (ticTac[4] == 'X' || ticTac[4] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[4] = 'O';
                        turn++;
                    } else {
                        ticTac[4] = 'X';
                        turn++;
                    }
                    break;
                case "2 1":
                    if (ticTac[7] == 'X' || ticTac[7] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[7] = 'O';
                        turn++;
                    } else {
                        ticTac[7] = 'X';
                        turn++;
                    }
                    break;
                case "3 3":
                    if (ticTac[2] == 'X' || ticTac[2] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[2] = 'O';
                        turn++;
                    } else {
                        ticTac[2] = 'X';
                        turn++;
                    }
                    break;
                case "3 2":
                    if (ticTac[5] == 'X' || ticTac[5] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[5] = 'O';
                        turn++;
                    } else {
                        ticTac[5] = 'X';
                        turn++;
                    }
                    break;
                case "3 1":
                    if (ticTac[8] == 'X' || ticTac[8] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (turn % 2 == 0) {
                        ticTac[8] = 'O';
                        turn++;
                    } else {
                        ticTac[8] = 'X';
                        turn++;
                    }
                    break;
            }

            System.out.println("---------" +
                    "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                    "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                    "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                    "\n---------" +
                    "\n");


            if (ticTac[0] == 'X' & ticTac[1] == 'X' & ticTac[2] == 'X' ||
                    ticTac[3] == 'X' & ticTac[4] == 'X' & ticTac[5] == 'X' ||
                    ticTac[6] == 'X' & ticTac[7] == 'X' & ticTac[8] == 'X' ||
                    ticTac[0] == 'X' & ticTac[3] == 'X' & ticTac[6] == 'X' ||
                    ticTac[1] == 'X' & ticTac[4] == 'X' & ticTac[7] == 'X' ||
                    ticTac[2] == 'X' & ticTac[5] == 'X' & ticTac[8] == 'X' ||
                    ticTac[0] == 'X' & ticTac[4] == 'X' & ticTac[8] == 'X' ||
                    ticTac[2] == 'X' & ticTac[4] == 'X' & ticTac[6] == 'X'
            ) {
                System.out.println("X wins");
                gameOn = false;
            } else if (ticTac[0] == 'O' & ticTac[1] == 'O' & ticTac[2] == 'O' ||
                    ticTac[3] == 'O' & ticTac[4] == 'O' & ticTac[5] == 'O' ||
                    ticTac[6] == 'O' & ticTac[7] == 'O' & ticTac[8] == 'O' ||
                    ticTac[0] == 'O' & ticTac[3] == 'O' & ticTac[6] == 'O' ||
                    ticTac[1] == 'O' & ticTac[4] == 'O' & ticTac[7] == 'O' ||
                    ticTac[2] == 'O' & ticTac[5] == 'O' & ticTac[8] == 'O' ||
                    ticTac[0] == 'O' & ticTac[4] == 'O' & ticTac[8] == 'O' ||
                    ticTac[2] == 'O' & ticTac[4] == 'O' & ticTac[6] == 'O'
            ) {
                System.out.println("O wins");
                gameOn = false;
            } else if (turn > 9){
                System.out.println("Draw");
                gameOn = false;
            }
        }
    }
}
