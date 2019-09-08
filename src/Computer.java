import java.util.Random;

public class Computer implements IComputer{
    private Random random = new Random();
    private int pointComp = 0;
    private int moveComp;

    @Override
    public void compMoves(){
        moveComp = random.nextInt(5);
        }

    @Override
    public String getMoveComp() {
        switch (moveComp){
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            case 3:
                return "lizard";
            case 4:
                return "Spock";
            default:
                return "";
        }
    }

    @Override
    public int pointsComp(){
        return pointComp++;
    }
}

