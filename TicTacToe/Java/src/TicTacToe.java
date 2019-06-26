import java.awt.AWTEvent;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 * 
 * @author ObiWanLansi
 *
 */
public class TicTacToe extends JFrame {

    /**
     * The winner combinations.
     */
    private final ArrayList<int[]>     lWinnerCombinations = new ArrayList<int[]>(8);

    /**
     * The current player.
     */
    private Player                     pCurrent            = Player.One;

    /**
     * Wich field from which player.
     */
    private Hashtable<Integer, Player> htFieldPlayer       = new Hashtable<Integer, Player>();


    // ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 
     */
    public TicTacToe() {

        // Alle Waagerechten
        lWinnerCombinations.add(new int[] { 0, 1, 2 });
        lWinnerCombinations.add(new int[] { 3, 4, 5 });
        lWinnerCombinations.add(new int[] { 6, 7, 8 });

        // Alle Senkrechten
        lWinnerCombinations.add(new int[] { 0, 3, 6 });
        lWinnerCombinations.add(new int[] { 1, 4, 7 });
        lWinnerCombinations.add(new int[] { 2, 5, 8 });

        // Die zwei Diagonalen
        lWinnerCombinations.add(new int[] { 0, 4, 8 });
        lWinnerCombinations.add(new int[] { 2, 4, 6 });

        // ---------------------------------------------------------------------

        enableEvents(AWTEvent.WINDOW_EVENT_MASK);

        Dimension dimScreen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimFrame = new Dimension(300, 300);
        Point pFrame = new Point((dimScreen.width - dimFrame.width) >> 1, (dimScreen.height - dimFrame.height) >> 1);

        setLocation(pFrame);
        setSize(dimFrame);

        setTitle("Tic Tac Toe");
        setLayout(new GridBagLayout());

        // ---------------------------------------------------------------------

        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed( ActionEvent arg ) {

                setFieldForPlayer((TicTacToeButton) arg.getSource());
                checkWinnerIsAvaible();
            }
        };

        // ---------------------------------------------------------------------

        add(new TicTacToeButton(0, al), new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(new TicTacToeButton(1, al), new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(new TicTacToeButton(2, al), new GridBagConstraints(2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

        add(new TicTacToeButton(3, al), new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(new TicTacToeButton(4, al), new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(new TicTacToeButton(5, al), new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

        add(new TicTacToeButton(6, al), new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(new TicTacToeButton(7, al), new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(new TicTacToeButton(8, al), new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

        // ---------------------------------------------------------------------

        setVisible(true);
    }


    // ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 
     * @param source
     */
    private void setFieldForPlayer( TicTacToeButton source ) {

        source.setPlayer(pCurrent);
        source.setEnabled(false);
        htFieldPlayer.put(source.getFieldIndex(), pCurrent);

        pCurrent = pCurrent == Player.One ? Player.Two : Player.One;
    }


    /**
     * 
     */
    private void checkWinnerIsAvaible() {

        for (int[] winner_combination : lWinnerCombinations) {

            if (htFieldPlayer.get(winner_combination[0]) == null || htFieldPlayer.get(winner_combination[1]) == null || htFieldPlayer.get(winner_combination[2]) == null) {
                continue;
            }

            if (htFieldPlayer.get(winner_combination[0]).equals(htFieldPlayer.get(winner_combination[1])) && htFieldPlayer.get(winner_combination[0]).equals(htFieldPlayer.get(winner_combination[2]))) {

                JOptionPane.showMessageDialog(this, String.format("Spieler %s hat gewonnen!", htFieldPlayer.get(winner_combination[0])), "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

                quit();
            }
        }
    }


    // ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     *
     */
    private void quit() {

        System.exit(0);
    }


    /**
     * @see java.awt.Window#processWindowEvent(java.awt.event.WindowEvent)
     */
    @Override
    protected void processWindowEvent( WindowEvent e ) {

        super.processWindowEvent(e);

        if (e.getID() == WindowEvent.WINDOW_CLOSING) {

            quit();
        }
    }


    // ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Haupteinstiegspunkt der Anwendung.
     * 
     * @param args
     */
    public static void main( String[] args ) {

        new TicTacToe();
    }

}
