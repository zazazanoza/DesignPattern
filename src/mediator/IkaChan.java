package mediator;

import java.util.ArrayList;
import java.util.List;

public class IkaChan implements Mediator {
    List<String> statusList = new ArrayList<String>();
    private RButton R;
    private ZLButton ZL;
    private ZRButton ZR;
    private Boolean isBombReady = false;

    public IkaChan(ZLButton ZL, ZRButton ZR, RButton R) {
        this.R = R;
        this.ZL = ZL;
        this.ZR = ZR;
        createColleagues();
    }

    @Override
    public void createColleagues() {
        R.setMediator(this);
        ZL.setMediator(this);
        ZR.setMediator(this);
    }

    @Override
    public void colleagueChanged(String status) {

        toggleStatus(status);

        if (statusList.size() == 0) {
            if (isBombReady && status == "R")
                R.setColleagueEnabled(false);
            System.out.println("ヒト状態");
            return;
        }

        switch (statusList.get(statusList.size() - 1)) {
        case "R":
            ZL.setColleagueEnabled(false);
            //ボムはRを離したときに投擲される
            R.setColleagueEnabled(true);
            isBombReady = true;
            break;
        case "ZL":
            if (isBombReady && status == "R")
                R.setColleagueEnabled(false);
            isBombReady = false;
            ZL.setColleagueEnabled(true);
            break;
        case "ZR":
            if (isBombReady && status == "R")
                R.setColleagueEnabled(false);
            isBombReady = false;
            ZL.setColleagueEnabled(false);
            ZR.setColleagueEnabled(true);
            break;

        }
        System.out.println("");
    }

    public void toggleStatus(String status) {
        if (statusList.contains(status)) {
            statusList.remove(status);
        } else {
            statusList.add(status);
        }
    }

}
