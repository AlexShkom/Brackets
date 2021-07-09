package B.Verificator;

import org.junit.Test;

public class BVTest_Exception {

    @Test (expected = IllegalArgumentException.class)

    public void Verification1() {
        BalanceVerificator BV = new BalanceVerificator();
        BV.Verification("[1[[1]]1]");
        //Explanation: "1" is not a brasket so checking causes exception
    }
}