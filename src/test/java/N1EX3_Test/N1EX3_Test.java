package N1EX3_Test;

import org.junit.Test;

public class N1EX3_Test {
    N1EX3 exercise3 = new N1EX3();

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testException(){
        exercise3.runProgram();
    }
}
