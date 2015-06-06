
public class TravelBusinessTest {
	public static void main(String[] args) {
		TravelBusiness business1 = new TravelBusiness();
		business1.setCarBenz(new CarBenz());
		business1.travelByBenz();
		
	  TravelBusiness business2 = new TravelBusiness();
	  business2.setCarBMW(new CarBMW());
	  business2.travelByBMW();
	}
}
