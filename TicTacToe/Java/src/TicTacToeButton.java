import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author ObiWanLansi
 *
 */
public class TicTacToeButton extends JButton {

	/**
	 * 
	 */
	final private int iIndex;

	/**
	 * 
	 */
	final private ActionListener al;

	/**
	 * 
	 * @param iIndex
	 * @param al
	 */
	public TicTacToeButton(int iIndex, ActionListener al) {

		this.iIndex = iIndex;
		this.al = al;
	}

	/**
	 * 
	 * @return
	 */
	public int getIndex() {
		return iIndex;
	}

	/**
	 * 
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

//	       g2d.setPaint(new GradientPaint(0,0,cBackgroundLeft,getWidth(),getHeight(),cBackgroundRight));
//	       g2d.fill( g.getClip() );
	}
}
