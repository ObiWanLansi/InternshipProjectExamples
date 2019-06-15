using System.Collections.Generic;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Shapes;


/**
 * Felidindexe:
 * 0 1 2
 * 3 4 5
 * 6 7 8
 */


namespace TicTacToe
{
    /// <summary>
    /// Interaktionslogik für MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        /// <summary>
        /// The player one
        /// </summary>
        private bool bPlayerOne = true;

        /// <summary>
        /// The field
        /// </summary>
        private readonly SortedDictionary<int, bool?> sdField = new SortedDictionary<int, bool?>();


        /// <summary>
        /// The winnercombinations
        /// </summary>
        private readonly List<int[]> lWinnerCombinations = new List<int[]>
        {
            // Alle Waagerechten
            { new [] { 0 , 1 , 2 } },
            { new [] { 3 , 4 , 5 } },
            { new [] { 6 , 7 , 8 } },

            // Alle Senkrechten
            { new [] { 0 , 3 , 6 } },
            { new [] { 1 , 4 , 7 } },
            { new [] { 2 , 5 , 8 } },

            // Die zwei Diagonalen
            { new [] { 0 , 4 , 8 } },
            { new [] { 2 , 4 , 6 } }
        };


        /// <summary>
        /// Initializes a new instance of the <see cref="MainWindow"/> class.
        /// </summary>
        public MainWindow()
        {
            InitializeComponent();

            for (int iCounter = 0; iCounter < 9; iCounter++)
            {
                this.sdField.Add(iCounter, null);
            }
        }


        /// <summary>
        /// Checks the winner is avaible.
        /// </summary>
        /// <returns></returns>
        private void CheckWinnerIsAvaible()
        {
            foreach (int[] winner_combination in this.lWinnerCombinations)
            {
                // Wenn eines der Felder noch null (also nicht gesetzt ist brauchen wir nicht weiter zu machen ...
                if (this.sdField[winner_combination[0]] == null || this.sdField[winner_combination[1]] == null || this.sdField[winner_combination[2]] == null)
                {
                    continue;
                }

                if (this.sdField[winner_combination[0]].Equals(this.sdField[winner_combination[1]]) && this.sdField[winner_combination[0]].Equals(this.sdField[winner_combination[2]]))
                {
                    MessageBox.Show(string.Format("Spieler {0} hat gewonnen!", this.sdField[winner_combination[0]].Value ? "1" : "2"));
                    Close();
                }
            }
        }


        /// <summary>
        /// Handles the Click event of the Button_Field control.
        /// </summary>
        /// <param name="sender">The source of the event.</param>
        /// <param name="e">The <see cref="RoutedEventArgs"/> instance containing the event data.</param>
        private void Button_Field_Click(object sender, RoutedEventArgs e)
        {
            Button btn = sender as Button;

            this.sdField[int.Parse(btn.Tag as string)] = this.bPlayerOne;

            // Setzen der Spieler Icons ...
            btn.Content = this.bPlayerOne ? (Shape)new Ellipse
            {
                Width = btn.ActualWidth - 10,
                Height = btn.ActualHeight - 10,
                Stroke = Brushes.Black,
                Fill = Brushes.Blue
            } : new Rectangle
            {
                Width = btn.ActualWidth - 10,
                Height = btn.ActualHeight - 10,
                Stroke = Brushes.Black,
                Fill = Brushes.Red
            };

            CheckWinnerIsAvaible();

            this.bPlayerOne = !this.bPlayerOne;

            btn.IsEnabled = false;

            e.Handled = true;
        }

    } // end public partial class MainWindow
}
