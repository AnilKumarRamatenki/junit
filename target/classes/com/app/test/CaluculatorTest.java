
import com.app.Caluculator;

public class CaluculatorTest {

	@Test
	public void addTest() {
			Caluculator calc=new Caluculator();
		int actualResult=calc.add(10, 30);
		int expectedResult=30;
		assertEquals(expectedResult,actualResult);
	}
	

}
