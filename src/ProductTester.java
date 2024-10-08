import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class ProductTester {

    @Test
    public void testElectronicsTotalPrice(){
        Product electronics = new Electronics("laptop", 10, 1000);
        assertEquals(1150, electronics.calculateTotalPrice());
   }
}
