package Tests;

import Verificatior.BalanceVerificator;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

class BVTest_BalancedHard {
    @Test
    void Verification1(){
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({{((([[[({[]})]]])))}})"), -1);
    }

}