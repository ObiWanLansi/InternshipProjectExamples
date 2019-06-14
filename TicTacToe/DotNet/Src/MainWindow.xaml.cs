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
        private Player pCurrent = Player.Player1;


        /// <summary>
        /// Initializes a new instance of the <see cref="MainWindow"/> class.
        /// </summary>
        public MainWindow()
        {
            InitializeComponent();
        }


        /// <summary>
        /// Handles the Click event of the Button_Field control.
        /// </summary>
        /// <param name="sender">The source of the event.</param>
        /// <param name="e">The <see cref="RoutedEventArgs"/> instance containing the event data.</param>
        private void Button_Field_Click(object sender, RoutedEventArgs e)
        {
            Button btn = sender as Button;


            switch (this.pCurrent)
            {
                case Player.Player1:
                    btn.Content = new Ellipse
                    {
                        Width = btn.ActualWidth - 10,
                        Height = btn.ActualHeight - 10,
                        Stroke = Brushes.Black,
                        Fill = Brushes.Blue
                    };
                    this.pCurrent = Player.Player2;
                    break;

                case Player.Player2:
                    btn.Content = new Rectangle
                    {
                        Width = btn.ActualWidth - 10,
                        Height = btn.ActualHeight - 10,
                        Stroke = Brushes.Black,
                        Fill = Brushes.Red
                    };
                    this.pCurrent = Player.Player1;
                    break;
            }

            btn.IsEnabled = false;
            e.Handled = true;
        }

    } // end public partial class MainWindow
}
