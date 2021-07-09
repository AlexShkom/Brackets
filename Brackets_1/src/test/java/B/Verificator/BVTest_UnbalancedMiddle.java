package B.Verificator;

import org.junit.Assert;
import org.junit.Test;

public class BVTest_UnbalancedMiddle {

    @Test

    public void Verification1() {
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({[[]})"), 4);
        //Explanation: unbalanced brasket is in the middle - on 4-th pos.
    }
}