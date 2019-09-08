public class Play implements IPlay {

    private IPlayer player = new Player();
    private IComputer comp = new Computer();


    private void check(){
        switch (player.getMovePlayer()) {
            case "rock":
                switch (comp.getMoveComp()) {
                    case "paper":
                        comp.pointsComp();
                        System.out.println("Paper wraps rock.");
                        break;
                    case "scissors":
                        player.pointsPlayer();
                        System.out.println("Rock crushes scissors.");
                        break;
                    case "lizard":
                        player.pointsPlayer();
                        System.out.println("Rock crushes lizard.");
                        break;
                    case "Spock":
                        comp.pointsComp();
                        System.out.println("Spock vaporizes rock.");
                        break;
                } break;
            case "paper":
                switch (comp.getMoveComp()) {
                    case "rock":
                        player.pointsPlayer();
                        System.out.println("Paper wraps rock.");
                        break;
                    case "scissors":
                        comp.pointsComp();
                        System.out.println("Scissors cut paper.");
                        break;
                    case "lizard":
                        comp.pointsComp();
                        System.out.println("Lizard eats paper.");
                        break;
                    case "Spock":
                        player.pointsPlayer();
                        System.out.println("Paper disproves Spock.");
                        break;
                } break;
            case "scissors":
                switch (comp.getMoveComp()) {
                    case "paper":
                        player.pointsPlayer();
                        System.out.println("Scissors cut paper.");
                        break;
                    case "rock":
                        comp.pointsComp();
                        System.out.println("Rock crushes scissors.");
                        break;
                    case "lizard":
                        player.pointsPlayer();
                        System.out.println("Scissors decapitate lizard.");
                        break;
                    case "Spock":
                        comp.pointsComp();
                        System.out.println("Spock smashes scissors.");
                        break;
                } break;
            case "lizard":
                switch (comp.getMoveComp()) {
                    case "paper":
                        player.pointsPlayer();
                        System.out.println("Lizard eats paper.");
                        break;
                    case "rock":
                        comp.pointsComp();
                        System.out.println("Rock crushes lizard.");
                        break;
                    case "scissors":
                        comp.pointsComp();
                        System.out.println("Scissors decapitate lizard.");
                        break;
                    case "Spock":
                        player.pointsPlayer();
                        System.out.println("Lizard poisons Spock.");
                        break;
                } break;
            case "Spock":
                switch (comp.getMoveComp()) {
                    case "paper":
                        comp.pointsComp();
                        System.out.println("Paper disproves Spock.");
                        break;
                    case "rock":
                        player.pointsPlayer();
                        System.out.println("Spock vaporizes rock.");
                        break;
                    case "lizard":
                        comp.pointsComp();
                        System.out.println("Lizard poisons Spock.");
                        break;
                    case "scissors":
                        comp.pointsComp();
                        System.out.println("Spock smashes scissors.");
                        break;
                } break;
            default:
                System.out.println("Wrong move.");
        }
    }
    private void finish(){
        System.out.println("Thank you!");
        System.out.println("Player's points: " + player.pointsPlayer() + ", computer's points: " + comp.pointsComp());
        if(player.pointsPlayer()==comp.pointsComp())
            System.out.println("It's a tie.");
        else if(player.pointsPlayer() > comp.pointsComp())
            System.out.println("Player won.");
        else
            System.out.println("Computer won.");
    }

    @Override
    public void start() {
        while(player.isMore()){
            System.out.println("rock - paper - scissors - lizard - Spock / stop");
            player.playerMoves();
            if(player.getMovePlayer().equals("stop")){
                player.setMore(false);
                finish();
                break;
            }
            comp.compMoves();
            System.out.println(comp.getMoveComp());
            check();
        }
    }
}
