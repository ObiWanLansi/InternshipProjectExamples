import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

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
	final private int iFieldIndex;

	/**
	 * 
	 */
	private Player p = null;

	/**
	 * 
	 * @param iFieldIndex
	 * @param al
	 */
	public TicTacToeButton(int iFieldIndex, ActionListener al) {

		this.iFieldIndex = iFieldIndex;

		this.addActionListener(al);
	}

	/**
	 * 
	 * @return
	 */
	public int getFieldIndex() {
		return iFieldIndex;
	}

	/**
	 * 
	 * @param p
	 */
	public void setPlayer(Player p) {
		this.p = p;
		repaint();
	}

	/**
	 * 
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		Dimension dim = getSize();

		if (p == null) {

			return;
		}

		Shape s = null;

		if (p == Player.One) {

			g2d.setPaint(Color.BLUE);

			s = new Rectangle(5, 5, dim.width - 10, dim.height - 10);

		} else {

			g2d.setPaint(Color.RED);

			s = new Ellipse2D.Double(5, 5, dim.width - 10, dim.height - 10);
		}

		g2d.fill(s);
	}
}
