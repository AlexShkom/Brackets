package B.Verificator;

import org.junit.Assert;
import org.junit.Test;

public class BVTest_UnbalancedTail {

    @Test

    public void Verification1() {
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({[]}))"), 2);
        //Explanation: first unbalanced brasket is actually the 2nd one - it has no pair where it should be.
    }
}