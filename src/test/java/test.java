import org.junit.Assert;
import org.junit.Test;
import ua.danit.Square;


public class test {
  @Test
 public void testSquare(){
  Square square = new Square(1,2,3);
  Assert.assertEquals("<Square><x>1</x><y>2</y><size>3</size></Square>", square.print());
 }

}
