package B.Verificator;

import org.junit.Assert;
import org.junit.Test;

public class BVTest_Balanced {

    @Test

    public void Verification1() {
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({[]})"), -1);
    }
}