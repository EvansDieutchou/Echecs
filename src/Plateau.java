import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Plateau {

	public void dessiner(Graphics g) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					g.setColor(Color.white);
					g.fillRect(i * 60, j * 60, 60, 60);
				} else {
					g.setColor(Color.gray);
					g.fillRect(i * 60, j * 60, 60, 60);
				}

			}
		}

	}

	Piece[][] pieces = new Piece[8][8];
	int[]caseSelectionnee;

	public Plateau() throws SlickException{
		pieces[2][2]=new Piece(2,2,2,false);
		pieces[4][3]=new Piece(4,3,1,false);
		pieces[4][4]=new Piece(4,4,3,true);
		caseSelectionnee=new int[2];
		caseSelectionnee[0]=-1;
		caseSelectionnee[1]=-1;
	}

	public void dessinerPieces(Graphics g) throws SlickException {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(pieces[i][j]!=null)
					pieces[i][j].dessiner(g);
			}
		}
	}
	
	public int[] quelleCase(int x,int y) {
		int[]caze={y/60,x/60};
		return caze;
	}
	
	public void clicCase(int x,int y) {
		int[]c=new int[2];
		c=quelleCase(x,y); 
		if(caseSelectionnee[0]==-1 && caseSelectionnee[1]==-1 && pieces[c[0]][c[1]]!=null) {
			caseSelectionnee[0]=c[0];
			caseSelectionnee[1]=c[1];
		}
		else if(caseSelectionnee[0]==c[0] && caseSelectionnee[1]==c[1]) {
			caseSelectionnee[0]=-1;
			caseSelectionnee[1]=-1;
		}
	}
	
	public void dessinerCaseSelectionnee(Graphics g) {
		if(caseSelectionnee[0]!=-1 && caseSelectionnee[0]!=-1) {
			Color couleur=new Color(255,0,0,128);
			g.setColor(couleur);
			g.fillRect(caseSelectionnee[1]*60, caseSelectionnee[0]*60, 60, 60);
		}
	}
	
}
