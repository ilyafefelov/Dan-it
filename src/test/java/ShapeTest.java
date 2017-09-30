import org.junit.Assert;
import org.junit.Test;
import ua.danit.Square;


public class ShapeTest {
  @Test
 public void testSquare(){
  Square square = new Square(1,2,3);
  Assert.assertEquals("<square><x>1</x><y>2</y><size>3</size></square>", square.print());
 }
}
