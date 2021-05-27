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
        int playerCount = 0;
        int opponentCount = 0;
        boolean end = false;
        System.out.println("Rounds to win: ");
        int roundsOfWin = scan.nextInt();
        while(!end){
            System.out.println("Your move: ");
            int playerMove = scan.nextInt();
            playerMove(playerMove);
            int opponentMove = new Random().nextInt(5)+1;
            opponentMove(opponentMove);
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
        System.out.println("Hi, tell me your name: ");
        String name  = scan.nextLine();
        System.out.println("Hello " + name + ". Welcome in expanded version of rock-paper-scissors game. \n" +
                "The game was created by Sam Kass and Karen Bryla and popularized by Big Bang Theory TV series. \n" +
                "The rules are very simple: \n" +
                "press 1 to play rock, \n" +
                "press 2 to play paper, \n" +
                "press 3 to play scissors, \n" +
                "press 4 to play lizard, \n" +
                "press 5 to play Spock. \n" +
                "Before you start decide how many rounds to win. Good luck and May The Force Be With You.");
    }
    public static void playerMove(int move){
            if (move == Symbols.ROCK.ordinal()){
                System.out.println("You played rock");
            }else if (move == Symbols.PAPER.ordinal()){
                System.out.println("You played paper");
            }else if (move == Symbols.SCISSORS.ordinal()){
                System.out.println("You played scissors");
            }else if (move == Symbols.LIZARD.ordinal()){
                System.out.println("You played lizard");
            }else if (move == Symbols.SPOCK.ordinal()) {
                System.out.println("You played Spock");
            } else{
                System.out.println("Wrong move, choose between 1 - 5");
            }
        }
    public static void opponentMove(int move){
            if (move == Symbols.ROCK.ordinal()){
                System.out.println("Your opponent played rock");
            }else if (move == Symbols.PAPER.ordinal()){
                System.out.println("Your opponent played paper");
            }else if (move == Symbols.SCISSORS.ordinal()){
                System.out.println("Your opponent played scissors");
            }else if (move == Symbols.LIZARD.ordinal()){
                System.out.println("Your opponent played lizard");
            }else{
                System.out.println("Your opponent played Spock");
            }
        }
    public static boolean playerWinCondition(int playerMove, int opponentMove){
        int rock = Symbols.ROCK.ordinal();
        int paper = Symbols.PAPER.ordinal();
        int scissors = Symbols.SCISSORS.ordinal();
        int lizard = Symbols.LIZARD.ordinal();
        int Spock = Symbols.SPOCK.ordinal();
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




