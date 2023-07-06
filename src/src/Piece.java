import java.util.ArrayList;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Piece {
	private int ligne, colonne, type;
	private boolean estBlanc;
	private Image img;
	public Piece(int ligne, int colonne, int type, boolean estBlanc) throws SlickException {
		super();
		this.ligne = ligne;
		this.colonne = colonne;
		this.type = type;
		this.estBlanc = estBlanc;
		if(estBlanc==true) {
			img=new Image(""+type+"B.png");
		}else {
			img=new Image(""+type+"N.png");
		}
	}
	
	public void dessiner(Graphics g) {
		g.drawImage(img, colonne*60, ligne*60);
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

//	public ArrayList<int[]> deplaementsCavalier(Plateau p){
//		ArrayList<int[]>tabArray=new ArrayList<int[]>();
//		if() {
//			
//		}
//	}
}
