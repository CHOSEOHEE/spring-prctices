package videosystem;

public class IronMan implements DigitalVideoDisc {
	private static final String title = "Iron Man";
	private static final String studio = "Mavel";
	
	@Override
	public String play() {
		return "playing "+ studio + "'s" + title;
	}

}
