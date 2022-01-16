import junit.framework.*;

public class TestAdd extends TestCase {
  public void testAdd(){
    int sum = Calc.add(2,4);
    assertTrue(sum == 6);
  }
}
