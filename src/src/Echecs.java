import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Echecs extends BasicGame {
	Plateau p;

	public Echecs(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		p = new Plateau();
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub

		p.dessinerPlateau(g);
		p.dessinerPieces(g);

		p.dessinerCaseSelectionnee(g);
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO Auto-generated method stub
		Input input = gc.getInput();
		if (input.isMousePressed(input.MOUSE_LEFT_BUTTON)) {
			p.clicCase(input.getMouseX(), input.getAbsoluteMouseY());
		}
	}

}
