
public class GlassFactory extends Factory{

	@Override
	public IRoom createRoom() {
		
		return new GlassRoom();
	}

	@Override
	public IDoor createDoor() {
		return new GlassDoor();
		
	}

	@Override
	public IWindow createWindow() {
		
		return new GlassWindow();
	}

	
}
