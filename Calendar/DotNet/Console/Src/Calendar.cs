using System;
using System.Diagnostics;
using System.Globalization;



namespace Calendar
{
    /// <summary>
    /// A Simple Consolen Calendar
    /// </summary>
    internal class Calendar
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
        /// Displays the calendar.
        /// </summary>
        /// <param name="iYear">The i year.</param>
        /// <param name="iMonth">The i month.</param>
        private static void DisplayCalendar(int iYear, int iMonth)
        {
            DateTime dtFirstDayInMonth = new DateTime(iYear, iMonth, 1);
            Console.Out.WriteLine("┌───────────────────────────┐");
            Console.Out.WriteLine("│ {0,25} │", string.Format("{0} {1}", dtFirstDayInMonth.ToString("MMMMM"), iYear));
            Console.Out.WriteLine("├────┬──────────────────────┤");
            Console.Out.WriteLine("│ KW │ MO DI MI DO FR SA SO │");
            Console.Out.WriteLine("├────┬──────────────────────┤");

            int iOffset = GetDayOfWeek(dtFirstDayInMonth.DayOfWeek);
            int iDaysInMonth = DateTime.DaysInMonth(iYear, iMonth);
            int iCalendarWeekStart = WeekOfDate(dtFirstDayInMonth);
            int iColumnCounter = iOffset;

            Console.Out.Write("│ {0,2} │", iCalendarWeekStart);

            for (int iOffsetCount = 0; iOffsetCount < iOffset; iOffsetCount++)
            {
                Console.Out.Write("   ");
            }

            for (int iDayOfTheMonth = 1; iDayOfTheMonth < iDaysInMonth + 1; iDayOfTheMonth++)
            {
                Console.Out.Write(" {0,2}", iDayOfTheMonth);

                if (iDayOfTheMonth < iDaysInMonth)
                {
                    if (++iColumnCounter > 6)
                    {
                        Console.Out.WriteLine(" │");
                        int iCalendarWeek = iCalendarWeekStart + ((iDayOfTheMonth + iOffset) / 7);
                        Console.Out.Write("│ {0,2} │", iCalendarWeek < 53 ? iCalendarWeek : 1);
                        iColumnCounter = 0;
                    }
                }
            }

            for (int iOffsetCount = 0; iOffsetCount < 6 - iColumnCounter; iOffsetCount++)
            {
                Console.Out.Write("   ");
            }

            Console.Out.WriteLine(" │");
            Console.Out.WriteLine("└────┴──────────────────────┘");
            Console.Out.WriteLine("");
        }


        /// <summary>
        /// 
        /// </summary>
        /// <param name="args"></param>
        private static void Main(string[] args)
        {
            DateTime dt = DateTime.Now;

            //DisplayCalendar(dt.Year, dt.Month - 1);
            DisplayCalendar(dt.Year, dt.Month);
            //DisplayCalendar(dt.Year, dt.Month + 1);

            if (Debugger.IsAttached)
            {
                Console.ReadKey(false);
            }
        }
    }
}
