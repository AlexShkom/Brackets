package Tests;

import Verificatior.BalanceVerificator;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

class BVTest_UnbalancedTail {
    @Test
    void Verification1(){
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({[]}))"), 2);
        //Explanation: first unbalanced brasket is actually the 2nd one - it has no pair where it should be.
    }

}