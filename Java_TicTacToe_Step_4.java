package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String input = scanner.nextLine();
        System.out.println("Enter the coordinates: ");
        String coordinates = scanner.nextLine();
        char[] ticTac = input.toCharArray();
        switch (input){
            case "1 1":
                if (ticTac[0] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[0] = 'X';
                }
                break;
            case "1 2":
                if (ticTac[3] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[3] = 'X';
                }
                break;
            case "1 3":
                if (ticTac[6] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[6] = 'X';
                }
                break;
            case "2 1":
                if (ticTac[1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[1] = 'X';
                }
                break;
            case "2 2":
                if (ticTac[4] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[4] = 'X';
                }
                break;
            case "2 3":
                if (ticTac[7] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[7] = 'X';
                }
                break;
            case "3 1":
                if (ticTac[2] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[2] = 'X';
                }
                break;
            case "3 2":
                if (ticTac[5] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[5] = 'X';
                }
                break;
            case "3 3":
                if (ticTac[8] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    ticTac[8] = 'X';
                }
                break;
        }
        
        System.out.println("---------" +
                "\n| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |" +
                "\n| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |" +
                "\n| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |" +
                "\n---------" +
                "\n");

    }
}
