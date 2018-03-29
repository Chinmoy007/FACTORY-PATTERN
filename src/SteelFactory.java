
public class SteelFactory extends Factory{

	@Override
	public IRoom createRoom() {
		
		return new SteelRoom();
	}

	@Override
	public IDoor createDoor() {
	
		return new SteelDoor();
	}

	@Override
	public IWindow createWindow() {
	
		return new SteelWindow();
	}



}
