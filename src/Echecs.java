import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Echecs extends BasicGame {
	Plateau plat;
//	Piece p;

	public Echecs(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		plat.dessiner(g);
		plat.dessinerPieces(g);
		plat.dessinerCaseSelectionnee(g);
	}		

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		plat=new Plateau();
	}

	@Override
	public void update(GameContainer gc, int alpha) throws SlickException {
		// TODO Auto-generated method stub
		Input inp=gc.getInput();
		if(inp.isMousePressed(inp.MOUSE_LEFT_BUTTON)) {
			plat.clicCase(inp.getMouseX(),inp.getMouseY());
		}
	}

}
