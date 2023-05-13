package command;

public class PlayGame implements Command{
    private Integer num;
    protected Hatsukaze hatsukaze;
    
    public PlayGame(Integer num,Hatsukaze hatsukaze) {
        this.num = num;
        this.hatsukaze = hatsukaze;
    }
    
    @Override
    public void execute() {
        hatsukaze.actionGame(num);
        
    }

}
