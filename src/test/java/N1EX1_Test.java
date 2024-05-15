import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;

public class N1EX1_Test {
    @Test
    public void listSize(){
        // Expected result
        int size = 12;
        String month8 = "August";
        N1EX1 list = new N1EX1();

        Assert.assertEquals(size,list.months().size());
        Assert.assertNotNull(list.months());
        Assert.assertEquals(month8,list.months().get(7));
    }
}
