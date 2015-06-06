
public class TravelBusiness {
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	
	public void travel() {
		if(car == null) {
			throw new RuntimeException("����J�T������...");
		}
		car.travelByCar();
	}
}
