package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean goodInput = true;

        System.out.println("Enter cells: ");
        String input = scanner.nextLine();
        char[] ticTac = input.toCharArray();
        System.out.println("---------" +
                "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                "\n---------" +
                "\n");

        System.out.println("Enter the coordinates: ");
        while (goodInput == true){
            String coordinate = scanner.nextLine();
            switch (coordinate) {
                case "1 3":
                    if (ticTac[0] == 'X' || ticTac[0] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[0] = 'X';
                        goodInput = false;
                    }
                    break;
                case "1 2":
                    if (ticTac[3] == 'X' || ticTac[3] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[3] = 'X';
                        goodInput = false;
                    }
                    break;
                case "1 1":
                    if (ticTac[6] == 'X' || ticTac[6] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[6] = 'X';
                        goodInput = false;
                    }
                    break;
                case "2 3":
                    if (ticTac[1] == 'X' || ticTac[1] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[1] = 'X';
                        goodInput = false;
                    }
                    break;
                case "2 2":
                    if (ticTac[4] == 'X' || ticTac[4] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[4] = 'X';
                        goodInput = false;
                    }
                    break;
                case "2 1":
                    if (ticTac[7] == 'X' || ticTac[7] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[7] = 'X';
                        goodInput = false;
                    }
                    break;
                case "3 3":
                    if (ticTac[2] == 'X' || ticTac[2] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[2] = 'X';
                        goodInput = false;
                    }
                    break;
                case "3 2":
                    if (ticTac[5] == 'X' || ticTac[5] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[5] = 'X';
                        goodInput = false;
                    }
                    break;
                case "3 1":
                    if (ticTac[8] == 'X' || ticTac[8] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        ticTac[8] = 'X';
                        goodInput = false;
                    }
                    break;
            }
        }
        System.out.println("---------" +
                "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                "\n---------" +
                "\n");
    }
}
