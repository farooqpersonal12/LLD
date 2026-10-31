package game;

import java.util.Deque;
import java.util.Scanner;
import board.Board;
import player.Player;
import rules.Rules;

public class Game {

    private Board board;
    private Rules rules;
    private Deque<Player> players;
    private boolean isGameover;

    public Game(Board board, Rules rules, Deque<Player> players) {
        this.board = board;
        this.rules = rules;
        this.players = players;
        this.isGameover = false;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {
        if (players.size() < 2) {
            throw new IllegalStateException("The game needs at least two players.");
        }

        Scanner scanner = new Scanner(System.in);

        while (!isGameover) {
            board.display();

            Player current = players.removeFirst();
            System.out.println(current.getName() + ", enter row and column (1-3):");

            if (!scanner.hasNextInt()) {
                if (!scanner.hasNext()) {
                    players.addFirst(current);
                    return;
                }
                scanner.next();
                System.out.println("Please enter two numbers.");
                players.addFirst(current);
                continue;
            }
            int row = scanner.nextInt() - 1;

            if (!scanner.hasNextInt()) {
                if (!scanner.hasNext()) {
                    players.addFirst(current);
                    return;
                }
                scanner.next();
                System.out.println("Please enter two numbers.");
                players.addFirst(current);
                continue;
            }
            int col = scanner.nextInt() - 1;

            if (!rules.isValidMove(board, row, col)) {
                System.out.println("Invalid move. Try again.");
                players.addFirst(current);
                continue;
            }

            board.placeMark(row, col, current.getSymbol());

            if (rules.checkWin(board, current.getSymbol())) {
                board.display();
                System.out.println(current.getName() + " wins!");
                isGameover = true;
            } else if (rules.checkDraw(board)) {
                board.display();
                System.out.println("It's a draw!");
                isGameover = true;
            } else {
                players.addLast(current);
            }
        }
    }
}
