
public class TravelBusiness {
	private CarBenz carBenz;
	private CarBMW carBMW;
	
	public void setCarBenz(CarBenz carBenz) {
		this.carBenz = carBenz;
	}
	
	public CarBenz getCarBenz() {
		return carBenz;
	}
	
	public void setCarBMW(CarBMW carBMW) {
		this.carBMW = carBMW;
	}
	
	public CarBMW getCarBMW() {
		return carBMW;
	}
	
	public void travelByBenz() {
		if(carBenz == null) {
			throw new RuntimeException("未輸入汽車種類...");
		}
		carBenz.travelByCar();
	}
	
	public void travelByBMW() {
		if(carBMW == null) {
			throw new RuntimeException("未輸入汽車種類...");
		}
		carBMW.travelByCar();
	}
}
