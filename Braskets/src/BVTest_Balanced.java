import org.junit.jupiter.api.Test;
import org.testng.Assert;

class BVTest_Balanced {
    @Test
    void Verification1(){
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertEquals(BV.Verification("({[]})"), -1);
    }

}