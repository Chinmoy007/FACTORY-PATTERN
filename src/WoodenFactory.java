
public class WoodenFactory extends Factory{

	@Override
	public IRoom createRoom() {
		
		return new WoodenRoom();
	}

	@Override
	public IDoor createDoor() {
		
		return new WoodenDoor();
	}

	@Override
	public IWindow createWindow() {
		
		return new WoodenWindow();
	}


}
