
public class TravelBusinessTest {
	public static void main(String[] args) {
		TravelBusiness business1 = new TravelBusiness();
		business1.setCar(new CarBenz());
		business1.travel();
		
		TravelBusiness business2 = new TravelBusiness();
		business2.setCar(new CarBMW());
		business2.travel();
	}
}
