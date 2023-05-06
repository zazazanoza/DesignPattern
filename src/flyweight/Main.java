package flyweight;

public class Main {

    public static void main(String[] args) {
        ManualFactory mf =ManualFactory.getInstance();
        
        mf.useManual("ねこの飼い方");
        mf.useManual("いぬの飼い方");
        mf.useManual("ねこの飼い方");
        
        mf.printManualList();
    }

}
