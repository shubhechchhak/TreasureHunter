public class TreasureHunterRunner {
    public static void main(String[] args) {
        TreasureHunter game = new TreasureHunter();
        if (game.gameOver == false) {
            game.play();
        }
    }
}