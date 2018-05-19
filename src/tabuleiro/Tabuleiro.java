package tabuleiro;


import javax.swing.JFrame;
import java.awt.*;


public class Tabuleiro extends JFrame { 

	private static final long serialVersionUID = 7180315435248431315L;
	public final int LARG_DEFAULT=800; 
	public final int ALT_DEFAULT=640;
	
	public Tabuleiro() {
		Toolkit tk=Toolkit.getDefaultToolkit(); 
		Dimension screenSize=tk.getScreenSize(); 
		int sl=screenSize.width;
		int sa=screenSize.height;
		int x=sl/2-LARG_DEFAULT/2;
		int y=sa/2-ALT_DEFAULT/2;
		setBounds(x,y,LARG_DEFAULT,ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE); }

	public void paint(Graphics g) {
	 Graphics2D g2 = (Graphics2D) g;
	
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				g2.drawRect(80+(600/8)*i,30+(600/8)*j,(600/8),(600/8));
				g2.setColor(((i+j) % 2) == 0 ? Color.WHITE : Color.BLACK);
				g2.fillRect(80+(600/8)*i,30+(600/8)*j,(600/8),(600/8));
			
			}
		}	
	}
}


