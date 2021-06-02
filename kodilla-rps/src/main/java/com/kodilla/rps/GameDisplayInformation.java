package com.kodilla.rps;

public class GameDisplayInformation {

    private static final String introduction = ". Welcome in expanded version of rock-paper-scissors game. \n" +
            "The game was created by Sam Kass and Karen Bryla and popularized by Big Bang Theory TV series. \n" +
            "The rules are very simple: \n" +
            "press 1 to play rock, \n" +
            "press 2 to play paper, \n" +
            "press 3 to play scissors, \n" +
            "press 4 to play lizard, \n" +
            "press 5 to play Spock. \n" +
            "Before you start decide how many rounds to win. Good luck and May The Force Be With You.";

    public String getIntro(){
        return introduction;
    }

    public void playerMove(int move){
        if (move == Symbols.ROCK.getNumber()){
            System.out.println("You played rock");
        }else if (move == Symbols.PAPER.getNumber()){
            System.out.println("You played paper");
        }else if (move == Symbols.SCISSORS.getNumber()){
            System.out.println("You played scissors");
        }else if (move == Symbols.LIZARD.getNumber()){
            System.out.println("You played lizard");
        }else if (move == Symbols.SPOCK.getNumber()) {
            System.out.println("You played Spock");
        } else{
            System.out.println("Wrong move, choose between 1 - 5");
        }
    }
    public void opponentMove(int move){
        if (move == Symbols.ROCK.getNumber()){
            System.out.println("Your opponent played rock");
        }else if (move == Symbols.PAPER.getNumber()){
            System.out.println("Your opponent played paper");
        }else if (move == Symbols.SCISSORS.getNumber()){
            System.out.println("Your opponent played scissors");
        }else if (move == Symbols.LIZARD.getNumber()){
            System.out.println("Your opponent played lizard");
        }else{
            System.out.println("Your opponent played Spock");
        }
    }
}
