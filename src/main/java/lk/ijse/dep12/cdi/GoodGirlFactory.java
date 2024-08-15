package lk.ijse.dep12.cdi;

/* this factory is singleton */
public class GoodGirlFactory {
    private static final GoodGirlFactory INSTANCE = new GoodGirlFactory();

    private GoodGirlFactory() {
    }

    public static GoodGirlFactory getInstance() {
        return INSTANCE;
    }

    /* Factory decides which good girl to give */
    public GoodGirl getGoodGirl() {
        return new Kaushi();
    }
}
