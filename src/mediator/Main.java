package mediator;

public class Main {

    public static void main(String[] args) {
        ZLButton ZL = new ZLButton();
        ZRButton ZR = new ZRButton();
        RButton R = new RButton();
        IkaChan ika1 = new IkaChan(ZL,ZR,R);
        
        ZR.FlipZR();
        ZR.FlipZR();
        System.out.println("");
        ZR.FlipZR();
        ZL.FlipZL();
        ZL.FlipZL();
        ZR.FlipZR();
        System.out.println("");
        R.FlipR();
        R.FlipR();
        System.out.println("");
        R.FlipR();
        ZL.FlipZL();
        R.FlipR();
        ZL.FlipZL();
        System.out.println("");
        R.FlipR();
        ZR.FlipZR();
        ZL.FlipZL();
        ZL.FlipZL();
        ZR.FlipZR();
        R.FlipR();
        
    }

}
