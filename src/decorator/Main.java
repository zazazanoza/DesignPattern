package decorator;

public class Main {

    public static void main(String[] args) {

        Decorate b1 = new Banana();
        Decorate b2 = new ChocoOption(b1);
        Decorate b3 = new AlazanOption(b2);

        b1.okaikei();
        b2.okaikei();
        b3.okaikei();
        
        Decorate b4 = new AlazanOption(
                            new ChocoOption(
                                    new AlazanOption(
                                            new Banana()
                                            
                                            )
                                    )
                            );
        b4.okaikei();
                
    }

}
