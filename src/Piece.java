import java.util.ArrayList;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Piece {
	private int ligne, colonne, type;
	private boolean estBlanc = true;
	private Image img;
	int i, j;

	public Piece(int ligne, int colonne, int type, boolean estBlanc) throws SlickException {
//		super();
		this.ligne = ligne;
		this.colonne = colonne;
		this.type = type;
		this.estBlanc = estBlanc;
		if ((estBlanc == false)) {
			if (type == 0) {
				img = new Image("jeuEchecs/pionN.png");
			}
			if (type == 1) {
				img = new Image("jeuEchecs/tourN.png");
			}
			if (type == 2) {
				img = new Image("jeuEchecs/cavalierN.png");
			}
			if (type == 3) {
				img = new Image("jeuEchecs/fouN.png");
			}
			if (type == 4) {
				img = new Image("jeuEchecs/reineN.png");
			}
			if (type == 5) {
				img = new Image("jeuEchecs/roiN.png");
			}
		} else {
			if (type == 0) {
				img = new Image("jeuEchecs/pionB.png");
			}
			if (type == 1) {
				img = new Image("jeuEchecs/tourB.png");
			}
			if (type == 2) {
				img = new Image("jeuEchecs/cavalierB.png");
			}
			if (type == 3) {
				img = new Image("jeuEchecs/fouB.png");
			}
			if (type == 4) {
				img = new Image("jeuEchecs/reineB.png");
			}
			if (type == 5) {
				img = new Image("jeuEchecs/roiB.png");
			}
		}
	}

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isEstBlanc() {
		return estBlanc;
	}

	public void setEstBlanc(boolean estBlanc) {
		this.estBlanc = estBlanc;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public void dessiner(Graphics g) throws SlickException {
		g.drawImage(img, colonne*60, ligne*60);
	}
	
//	ArrayList<int[]> deplacementsCavalier(Plateau p){
//		int[]dep=new int[2];
//		
//	}
	
}
