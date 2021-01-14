package lvl2lesson1.hurdles;

import lvl2lesson1.Game;

public class Treadmill implements Hurdles{
    private final int length;

    public Treadmill (int length) {
        this.length = length;
    }

    public void chek(Game game) {
        game.run();
        game.setSesur(game.getLengthMax() >=length);
        if (game.getSesur()) {
            System.out.println( "Игрок " + game.getName() + " проходит дистанцию длиной: " + length + " км");
        } else {
            System.out.println("Игрок " + game.getName() + " не проходит дистанцию длиной: " + length + " км");
        }
    }
}
