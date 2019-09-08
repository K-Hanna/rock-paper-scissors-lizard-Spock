import java.util.Scanner;

public class Player implements IPlayer{
    private Scanner scanner = new Scanner(System.in);
    private int pointPlayer = 0;
    private boolean more = true;
    private String movePlayer;

    @Override
    public void playerMoves(){
        movePlayer = scanner.next();
    }

    @Override
    public String getMovePlayer() {
        return movePlayer;
    }

    @Override
    public void setMore(boolean more) {
        this.more = more;
    }
    @Override
    public boolean isMore() {
        return more;
    }

    @Override
    public int pointsPlayer(){
        return pointPlayer++;
    }
}
