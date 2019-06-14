using System;

namespace Calendar
{
    /// <summary>
    /// A Simple Consolen Calendar
    /// </summary>
    class Calendar
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            DateTime dtToday = DateTime.Now;

            //DateTime dtToday = new DateTime(2018, 1, 1);

            //                              1         2
            //                     12345678901234567890123456789
            Console.Out.WriteLine("┌───────────────────────────┐");
            Console.Out.WriteLine("│ {0,25} │", string.Format("{0} {1}", dtToday.ToString("MMMMM"), dtToday.Year));
            Console.Out.WriteLine("├────┬──────────────────────┤");
            Console.Out.WriteLine("│ KW │ MO DI MI DO FR SA SO │");
            Console.Out.WriteLine("├────┬──────────────────────┤");
            Console.Out.WriteLine("│ XX │ XX XX XX XX XX XX XX │");
            Console.Out.WriteLine("│ XX │ XX XX XX XX XX XX XX │");
            Console.Out.WriteLine("│ XX │ XX XX XX XX XX XX XX │");
            Console.Out.WriteLine("│ XX │ XX XX XX XX XX XX XX │");
            Console.Out.WriteLine("│ XX │ XX XX XX XX XX XX XX │");
            Console.Out.WriteLine("└────┴──────────────────────┘");
            Console.Out.WriteLine("");
            Console.Out.WriteLine("");

            Console.ReadKey(false);
        }
    }
}
