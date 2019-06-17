import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TicTacToeButton extends JButton {

	final private int iIndex;
	final private ActionListener al;

	public TicTacToeButton(int iIndex, ActionListener al) {

		this.iIndex = iIndex;
		this.al = al;
	}

	public int getIndex() {
		return iIndex;
	}
}
