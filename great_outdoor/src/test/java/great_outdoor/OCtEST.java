/**
 * 
 */
package great_outdoor;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.capgemini.go.controller.OrderController;

/**
 * @author Lavam
 *
 */
class OCtEST {
	@Before
	void setup() {
		
	}
	
	@Test
	void check() {
		OrderController oc=new OrderController();
		String s=oc.additemtoCart();
		assertEquals("Item Added Successfully To The Cart",s);
	}

}
