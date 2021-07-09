import org.junit.jupiter.api.Test;
import org.testng.Assert;

class BVTest_Exception {
    @Test
    void Verification1(){
        BalanceVerificator BV = new BalanceVerificator();
        Assert.assertThrows(IllegalArgumentException.class, () -> BV.Verification("[][]]]1"));
        //Explanation: "1" is not a brasket so checking causes exception
    }

}