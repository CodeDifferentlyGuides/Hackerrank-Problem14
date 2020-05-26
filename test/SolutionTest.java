import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructSolutionTest(){
        String input = "3
                        uncle sam
                        99912222
                        tom
                        11122222
                        harry
                        12299933
                        uncle sam
                        uncle tom
                        harry";
        
        String expected = "uncle sam=99912222
                           Not found
                           harry=12299933";
                           
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
