import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class MainEchecs {

	public static void main(String[] args) throws SlickException {
		// TODO Auto-generated method stub
		AppGameContainer app= new AppGameContainer(new Echecs("Jeu d'�checs"));
		app.setTargetFrameRate(60);
		app.setShowFPS(false);
		app.setDisplayMode(480, 480, false);
		app.start();
	}

}
