using System;
using System.Globalization;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;

namespace Calendar
{
    /// <summary>
    /// Interaktionslogik für MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        /// <summary>
        /// The GregorianCalendar.
        /// </summary>
        private static readonly GregorianCalendar CAL = new GregorianCalendar();

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /// <summary>
        /// Gets the day of week.
        /// </summary>
        /// <param name="dt">The dt.</param>
        /// <returns></returns>
        private static int GetDayOfWeek(DayOfWeek dow)
        {
            int iValue = (int)dow - 1;
            return iValue < 0 ? 6 : iValue;
        }


        /// <summary>
        /// Week of the date.
        /// </summary>
        /// <param name="dt">The dt.</param>
        /// <returns></returns>
        private static int WeekOfDate(DateTime dt)
        {
            int week = CAL.GetWeekOfYear(dt, CalendarWeekRule.FirstFourDayWeek, DayOfWeek.Monday);
            return week > 0 && week < 53 ? week : 1;
        }

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /// <summary>
        /// Initializes a new instance of the <see cref="MainWindow"/> class.
        /// </summary>
        public MainWindow()
        {
            InitializeComponent();

            SetupGUI(DateTime.Now);
            //SetupGUI(new DateTime(2019, 12, 24));
        }

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        /// <summary>
        /// Setups the GUI.
        /// </summary>
        /// <param name="dt">The dt.</param>
        private void SetupGUI(DateTime dt)
        {
            this.Title = $"{dt.ToString("MMMMM")} {dt.Year} ";

            DateTime dtFirstDayInMonth = new DateTime(dt.Year, dt.Month, 1);

            int iOffset = GetDayOfWeek(dtFirstDayInMonth.DayOfWeek);
            int iDaysInMonth = DateTime.DaysInMonth(dt.Year, dt.Month);
            int iCalendarWeekStart = WeekOfDate(dtFirstDayInMonth);

            int iColumnCounter = iOffset;
            int iRowCounter = 1;

            this.grid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(1, GridUnitType.Star) });

            Label lCwFc = new Label
            {
                Content = iCalendarWeekStart,
                Background = Brushes.Aqua,
                BorderBrush = Brushes.Black,
                BorderThickness = new Thickness(1),
                Margin = new Thickness(1),
                HorizontalContentAlignment = HorizontalAlignment.Right
            };

            this.grid.Children.Add(lCwFc);

            Grid.SetColumn(lCwFc, 0);
            Grid.SetRow(lCwFc, 1);

            for (int iDayOfTheMonth = 1; iDayOfTheMonth < iDaysInMonth + 1; iDayOfTheMonth++)
            {
                Label l = new Label
                {
                    Content = iDayOfTheMonth,
                    Background = (iColumnCounter == 5 || iColumnCounter == 6) ? Brushes.DeepSkyBlue : Brushes.SkyBlue,
                    BorderBrush = Brushes.Black,
                    BorderThickness = new Thickness(1),
                    Margin = new Thickness(1),
                    HorizontalContentAlignment = HorizontalAlignment.Right
                };

                this.grid.Children.Add(l);

                Grid.SetColumn(l, iColumnCounter + 1);
                Grid.SetRow(l, iRowCounter);

                if (iDayOfTheMonth < iDaysInMonth)
                {
                    if (++iColumnCounter > 6)
                    {
                        iColumnCounter = 0;
                        iRowCounter++;

                        int iCalendarWeek = iCalendarWeekStart + ((iDayOfTheMonth + iOffset) / 7);

                        this.grid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(1, GridUnitType.Star) });

                        Label lWeek = new Label
                        {
                            Content = iCalendarWeek < 53 ? iCalendarWeek : 1,
                            Background = Brushes.Aqua,
                            BorderBrush = Brushes.Black,
                            BorderThickness = new Thickness(1),
                            Margin = new Thickness(1),
                            HorizontalContentAlignment = HorizontalAlignment.Right
                        };

                        this.grid.Children.Add(lWeek);

                        Grid.SetColumn(lWeek, 0);
                        Grid.SetRow(lWeek, iRowCounter);
                    }
                }
            }
        }
    }
}
