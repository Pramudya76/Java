import lib.myLib;
import lib.yourLib;
import test.*;

public class Akseslib2 {

    public static void main(String[] args) {
        myLib m = new myLib();
            m.cetak();
            yourLib y = new yourLib();
            y.cetak();
            hisLib h = new hisLib();
            h.cetak();
    }
}