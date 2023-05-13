package command;

public class Sleep implements Command {
    private Integer num;
    protected Hatsukaze hatsukaze;
    
    public Sleep(Integer num,Hatsukaze hatsukaze) {
        this.num = num;
        this.hatsukaze = hatsukaze;
    }
    
    @Override
    public void execute() {
        hatsukaze.actionSleep(num);
        
    }

}
