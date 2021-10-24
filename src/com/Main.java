package com;

import com.Bingo.*;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // set up the game
        int cardOne[][] = {
            {24,2,8,1,25},
            {12,16,7,17,15},
            {5,6,20,19,13},
            {14,23,22,4,3},
            {10,18,11,21,9}
        };

        int cardTwo[][] = {
            {24,21,17,15,6},
            {10,3,8,18,20},
            {14,7,16,12,5},
            {25,23,13,19,11},
            {22,4,9,1,2}
        };
        
        com.Bingo.Player playerOne = new com.Bingo.Player("Player 1" , cardOne );
        com.Bingo.Player playerTwo = new com.Bingo.Player("Player 2" , cardTwo );

        com.Bingo.Host gameOne = new com.Bingo.Host(playerOne , playerTwo);

        gameOne.showPlayerCard();

        int input;
        while (true) {
            // prompt user
            System.out.printf("Game Host call (0 to exit): ");
            input = sc.nextInt();

            if (input == 0) {
                // exit the program
                break;
            }

            if (gameOne.isVaildNumber(input)) {
                
                gameOne.update(input);
                gameOne.showPlayerCard();

            }
            else  {
                // receive next vaild input
                System.out.printf("Game Host call (0 to exit): The number %d is repeated, please call again!\n" , input);
                continue;
            }


        }

        
        


    } 
}
