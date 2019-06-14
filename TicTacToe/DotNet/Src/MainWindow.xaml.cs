using System.Collections.Generic;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Shapes;



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
        private SortedDictionary<int, bool?> sdField = new SortedDictionary<int, bool?>();


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
        private bool CheckWinnerIsAvaible()
        {
            //TODO MessageBox
            return false;
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

            // Check ob jemand schon gewonnen hat und dann einfach beenden ;-) ...
            if (CheckWinnerIsAvaible() == true)
            {
                Close();
            }

            this.bPlayerOne = !this.bPlayerOne;

            btn.IsEnabled = false;

            e.Handled = true;
        }

    } // end public partial class MainWindow
}
