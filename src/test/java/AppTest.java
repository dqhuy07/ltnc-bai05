import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
  @Test
  public void testOne() {
    assertEquals(App.add(1,0),1);
  }

  @Test
  public void TestTwo() {
    assertEquals(App.add(1,-3),-2);
  }

  @Test
  public void testThree() {
    assertEquals(App.add(0,0),0);
  }
}
