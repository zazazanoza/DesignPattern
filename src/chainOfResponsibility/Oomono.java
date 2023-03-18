package chainOfResponsibility;

public enum Oomono {
    HEBI("ヘビ"),
    BAKUDAN("バクダン"),
    TOWER("タワー"),
    TEPPAN("テッパン"),
    MOGURA("モグラ");
    
    private String m;
    private Oomono(String m) {
        this.m = m;
    }
};
