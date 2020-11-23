import org.junit.Test;
import static org.junit.Assert.*; 

public class MainTest{

  @Test
  public void testNothing(){}

  @Test
  public void testSomeStuff(){
    assertEquals(5, 2+3);

    String s = "";
    assertNotNull(s);

    assertTrue((3*7)>(4*5));

  }


}