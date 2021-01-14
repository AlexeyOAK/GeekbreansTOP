package lvl2lesson1.hurdles;

import lvl2lesson1.Game;

public class Wall implements Hurdles {
    private final int height;

    public Wall (int length) {
        this.height = length;
    }

    public void chek(Game game) {
        game.jump();
        game.setSesur(game.getHeightMax() >= height);
        if (game.getSesur()) {
            System.out.println( "Игрок " + game.getName() + " перепрыгнул стену высотой: " + height + " м");
        } else {
            System.out.println("Игрок " + game.getName() + " не перепрыгнул стену высотой: " + height + " м");
        }
    }
}

