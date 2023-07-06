import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Plateau {
	private Piece[][] pieces = new Piece[8][8];
	private int[] caseSelectionnee = new int[2];

	public Plateau() throws SlickException {
		pieces[0][0] = new Piece(2, 2, 2, false);
		pieces[0][1] = new Piece(4, 3, 1, false);
		pieces[0][2] = new Piece(4, 4, 3, true);

		caseSelectionnee[0] = -1;
		caseSelectionnee[1] = -1;
	}

	public void dessinerPlateau(Graphics g) {
		int x = 0, y = 0;
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 60; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
					g.setColor(Color.white);
					g.fillRect(x, y, 60, 60);
					x += 60;
				} else {
					g.setColor(Color.gray);
					g.fillRect(x, y, 60, 60);
					x += 60;
				}
			}
			x = 0;
			y += 60;
		}
	}

	public void dessinerPieces(Graphics g) {
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces[i].length; j++) {
				if (pieces[i][j] != null)
					pieces[i][j].dessiner(g);
			}
		}
	}

	public int[] quelleCase(int x, int y) {
		int[] tab = new int[2];
		tab[0] = x / 60;
		tab[1] = y / 60;
		return tab;
	}

	public void clicCase(int x, int y) {
		int x0 = this.quelleCase(x, y)[1];
		int y0 = this.quelleCase(x, y)[0];
		if (caseSelectionnee[0] == -1 && caseSelectionnee[1] == -1) {
			boolean b = false;
			for (int i = 0; i < pieces.length; i++) {
				for (int j = 0; j < pieces[i].length; j++) {
					if (pieces[i][j] != null && x0 == pieces[i][j].getLigne() && y0 == pieces[i][j].getColonne()) {
						b = true;
					}
				}
			}
			if (b) {
				caseSelectionnee[0] = x0;
				caseSelectionnee[1] = y0;
			}
		} else {
			if (x0 == caseSelectionnee[0] && y0 == caseSelectionnee[1]) {
				caseSelectionnee[0] = -1;
				caseSelectionnee[1] = -1;
			}

		}

	}

	public void dessinerCaseSelectionnee(Graphics g) {
		g.setColor(new Color(255, 0, 0, 128));
		g.fillRect(caseSelectionnee[1] * 60, caseSelectionnee[0] * 60, 60, 60);
	}
}
