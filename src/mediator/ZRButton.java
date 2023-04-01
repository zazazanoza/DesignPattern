package mediator;

public class ZRButton implements Colleague {
    private Mediator mediator;
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(Boolean enabled){
        if(enabled) System.out.print("メイン使用中");
    }
    
    public void FlipZR() {
        mediator.colleagueChanged("ZR");
    }
    
}
