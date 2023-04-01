package mediator;

public class ZLButton implements Colleague {
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(Boolean enabled) {
        if(enabled) {
            System.out.print("イカ状態 ");
          }else {
              System.out.print("ヒト状態 ");
          }
    }
    
    public void FlipZL() {
        mediator.colleagueChanged("ZL");
    }
}
