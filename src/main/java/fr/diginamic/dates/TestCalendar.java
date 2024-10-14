package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date date = calendar.getTime();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatJourMoisAnnee.format(date));

        Calendar calendarAjd = Calendar.getInstance();
        Date dateNow = calendarAjd.getTime();
        SimpleDateFormat formatComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatComplet.format(dateNow));

        SimpleDateFormat formatFr = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRENCH);
        SimpleDateFormat formatRu = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.of("ru", "RU"));
        SimpleDateFormat formatCn = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
        SimpleDateFormat formatDe = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);

        System.out.println(formatFr.format(dateNow));
        System.out.println(formatRu.format(dateNow));
        System.out.println(formatCn.format(dateNow));
        System.out.println(formatDe.format(dateNow));

    }
}
