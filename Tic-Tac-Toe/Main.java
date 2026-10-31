import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import board.Board;
import enums.Symbol;
import game.Game;
import player.Player;
import rules.Rules;
import rules.StandardRules;
import symbol.symbol;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        symbol symbolX = new symbol();
        symbolX.setMark('X');
        symbol symbolO = new symbol();
        symbolO.setMark('O');

        Board board = new Board();
        Rules rules = new StandardRules();
        Player p1 = new Player(1, "umar", Symbol.X);
        Player p2 = new Player(2, "farooq", Symbol.O);

        Deque<Player> players = new LinkedList<>();
        players.add(p1);
        players.add(p2);

        Game game = new Game(board, rules, players);
        game.play();
    }
}
