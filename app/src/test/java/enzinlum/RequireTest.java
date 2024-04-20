package enzinlum;

import org.junit.Test;

public class RequireTest {
    @Test(expected = ConditionNotMetException.class)
    public void falseRequireTest(){
        Address myaddress = new Address();
        myaddress.generateKeyPair();
        TokenContract mytoken = new TokenContract(myaddress);
        mytoken.require(false);
    }
}
