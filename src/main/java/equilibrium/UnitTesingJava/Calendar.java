package equilibrium.UnitTesingJava;

import java.util.HashMap;
import java.util.Map;

public class Calendar
{
    Map<Integer,Integer> monthToDays = new HashMap<>();
    Calendar()
    {
        monthToDays.put(1,31);
        monthToDays.put(2,28);
        monthToDays.put(3,31);
        monthToDays.put(4,30);
        monthToDays.put(5,31);
        monthToDays.put(6,30);
        monthToDays.put(7,31);
        monthToDays.put(8,31);
        monthToDays.put(9,30);
        monthToDays.put(10,31);
        monthToDays.put(11,30);
        monthToDays.put(12,31);
    }
    public int DaysNumber(int year, int month)
    {
        if (month == 2)
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                return monthToDays.get(month) + 1;
            } else
            {
                return monthToDays.get(month);
            }
        }
        else
        {
            return monthToDays.get(month);
        }
    }
}
