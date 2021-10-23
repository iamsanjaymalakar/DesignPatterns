package creational.factorymethod;

public class BikeFactory extends TransportFactory {
	Transport create() {
		return new Bike();
	}
}
