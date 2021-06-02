package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        intro(game);
        gameRunner(game);
        ending(game);
    }
    public static void gameRunner(Scanner scan){
        GameDisplayInformation moveDescription = new GameDisplayInformation();
        int playerCount = 0;
        int opponentCount = 0;
        boolean end = false;

        System.out.println("Rounds to win: ");
        int roundsOfWin = scan.nextInt();
        while(!end){
            System.out.println("Your move: ");
            int playerMove = scan.nextInt();
            moveDescription.playerMove(playerMove);
            int opponentMove = new Random().nextInt(5)+1;
            moveDescription.opponentMove(opponentMove);
            if (playerWinCondition(playerMove, opponentMove)) {
                playerCount ++;
            }else if (playerMove == opponentMove){
                playerScore(playerCount);
                opponentScore(opponentCount);
            } else{
                opponentCount ++;
            }

            if (roundsOfWin == playerCount || roundsOfWin == opponentCount){
                end = true;
            }
            System.out.println("Round score " + playerCount + ":" + opponentCount);
        }
        gameScore(playerCount, opponentCount);
        scan.nextLine();
    }

    public static void intro(Scanner scan){
        GameDisplayInformation introduction = new GameDisplayInformation();
        System.out.println("Hi, tell me your name: ");
        String name  = scan.nextLine();
        System.out.println("Hello " + name + introduction.getIntro());
    }

    public static boolean playerWinCondition(int playerMove, int opponentMove){
        int rock = Symbols.ROCK.getNumber();
        int paper = Symbols.PAPER.getNumber();
        int scissors = Symbols.SCISSORS.getNumber();
        int lizard = Symbols.LIZARD.getNumber();
        int Spock = Symbols.SPOCK.getNumber();
        return (playerMove == rock && opponentMove == scissors) || (playerMove == paper && opponentMove == rock) ||
                (playerMove == scissors && opponentMove == paper) || (playerMove == rock && opponentMove == lizard) ||
                (playerMove == lizard && opponentMove == Spock) || (playerMove == Spock && opponentMove == scissors) ||
                (playerMove == scissors && opponentMove == lizard) || (playerMove == lizard && opponentMove == paper) ||
                (playerMove == paper && opponentMove == Spock) || (playerMove == Spock && opponentMove == rock);
    }
    public static int playerScore(int playerCount){
        return playerCount;
    }
    public static int opponentScore(int opponentCount){
        return opponentCount;
    }
    public static void gameScore(int player, int opponent){
        if (playerScore(player) > opponentScore(opponent)){
            System.out.println("The game score is " + player + ":" + opponent + ". Congratulation, you win.");
        }else{
            System.out.println("The game score is " + player + ":" + opponent + ". Sorry, but you lose.");
        }
    }
    public static void ending (Scanner scan) {
        System.out.println("Do you want to play again (press n) or end the game (press x)?");
        String againOrEnd = scan.nextLine();
        if (againOrEnd.equals("n")) {
            gameRunner(scan);
        } else {
            System.out.println("Thank you for playing the game. I hope you enjoy it. Live long and prosper.");
            scan.close();
        }
    }
}




