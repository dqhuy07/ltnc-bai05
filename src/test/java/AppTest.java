import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
  @Test
  public void testOne() {
    assertEquals(5, App.add(2,3));
  }

  @Test
  public void TestTwo() {
    assertEquals(-5,App.add(-2,-3));
  }

  @Test
  public void testThree() {
    assertEquals(-1,App.add(2,-3));
  }

  @Test
  public void testFour() {
    assertEquals(3,App.add(3,0));
  }

  @Test
  public void testFive() {
    assertEquals(Integer.MAX_VALUE, App.add(Integer.MAX_VALUE, 0));
  }
}
