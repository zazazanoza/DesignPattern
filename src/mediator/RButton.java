package mediator;

public class RButton implements Colleague {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(Boolean enabled) {
        //trueは構えた状態（ボタンを押した状態なので）
        if(enabled) {
            System.out.print("ボム投擲準備中");
          }else {
              System.out.print("ボム投擲 ");
          }
    }

    public void FlipR() {
        mediator.colleagueChanged("R");
    }
}
