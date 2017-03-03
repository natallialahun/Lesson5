package com.epam.lesson5;

import java.time.Month;
import java.util.*;

/**
 * Created by Natallia_Lahun on 02/21/2017.
 */

public class CalendarTest {

    public static void main(String[] args)
    {

        final Integer year = 2017;
        GregorianCalendar calendar = new GregorianCalendar();
        int dayToday = calendar.get(Calendar.DAY_OF_MONTH);
        int monthToday = calendar.get(Calendar.MONTH);
        for (int j=0; j<12; j+=3){
            List<Calendar> calendars = new ArrayList<>();
            int maxNumberOfWeeks = 0;
            for (int idx = 0; idx < 3; idx++) {
                calendars.add(new GregorianCalendar(year, j+idx, 1));
                if (calendars.get(idx).getActualMaximum(Calendar.WEEK_OF_MONTH) > maxNumberOfWeeks) {
                    maxNumberOfWeeks = calendars.get(idx).getActualMaximum(Calendar.WEEK_OF_MONTH);
                }
                StringBuilder sb = new StringBuilder(Month.of(calendars.get(idx).get(Calendar.MONTH)+1).toString());
                sb = addSpaces(sb, 26);
                System.out.print(sb);

            }


            System.out.println();

            System.out.println("Вс Пн Вт Ср Чт Пт Сб      Вс Пн Вт Ср Чт Пт Сб      Вс Пн Вт Ср Чт Пт Сб");
            int week = 1;
            while (week <= maxNumberOfWeeks){
                StringBuilder stringBuilder = new StringBuilder();
                for (int idx = 0; idx < 3; idx++) {
                    Calendar calendarCurrent = calendars.get(idx);
                    stringBuilder = stringBuilder.append(getFormatedWeek(calendarCurrent, week, dayToday, monthToday));
                   if (idx < 2){
                        stringBuilder.append("     ");
                    }
                }
                System.out.println(stringBuilder);
                week++;
            }

            System.out.println();
        }

    }

    private static StringBuilder getFormatedWeek(Calendar calendar, int numberOfWeek, int dayToday, int monthToday){
        StringBuilder sb = new StringBuilder();
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = Calendar.SUNDAY; i < weekday; i++) {
            sb.append("   ");
        }

        while (calendar.get(Calendar.WEEK_OF_MONTH) == numberOfWeek) {
            weekday = calendar.get(Calendar.DAY_OF_WEEK);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            if (day < 10) {
                sb.append(" ");
            }
            sb.append(day);
            if (calendar.get(Calendar.MONTH) == monthToday && day == dayToday) {
                sb.append("*");
            } else {
                sb.append(" ");
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        for (int i = weekday; i < Calendar.SATURDAY; i++) {
            sb.append("   ");
        }

        sb = addSpaces(sb, 21);

        return sb;
    }

    private static StringBuilder addSpaces(StringBuilder sb, int spacesNumber) {
        while (sb.length()<spacesNumber) {
            sb.append(" ");
        }
        return sb;
    }


}