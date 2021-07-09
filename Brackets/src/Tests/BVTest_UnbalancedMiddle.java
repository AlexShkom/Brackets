package Tests;

import Verificatior.BalanceVerificator;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

class BVTest_UnbalancedMiddle {
    @Test
    void Verification1(){
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({[[]})"), 4);
        //Explanation: unbalanced brasket is in the middle - on 4-th pos.
    }

}