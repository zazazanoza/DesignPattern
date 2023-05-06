package flyweight;

public class Manual {
    private String title;

    public Manual(String title) {
        this.title = title;

        //マニュアルを作成する。時間がかかるとする
        try {
            System.out.println(title + "の手順書が無かった。");
            Thread.sleep(5000);
            System.out.println(title + "の手順書を作った。");
        } catch (InterruptedException e) {
            // エラー処理
        }

    }

    public void print() {
        System.out.println(title);
    }

}
