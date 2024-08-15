package lk.ijse.dep12.cdi;

public class Boy {
//    Girl gf = new Girl();
    /* strategy design pattern */
//    GoodGirl gf =new Piumi();
//    GoodGirl gf =new Kaushi();

    /* Get a good girl from factory
    * like parents finding a girl for the boy
    * factory can decide which girl to give */
    GoodGirl gf = GoodGirlFactory.getInstance().getGoodGirl();

    public void kissHer() {
        gf.kiss();
    }
}
