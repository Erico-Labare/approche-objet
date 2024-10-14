package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Date date = new Date(124, 11, 14);
        SimpleDateFormat jour_mois_annee = new SimpleDateFormat(("dd/MM/yyyy"));
        System.out.println(jour_mois_annee.format(date));

        Date date2 = new Date(116, 04, 19, 23, 59, 30);
        SimpleDateFormat AAAA_MM_JJ_HH_mm_ss = new SimpleDateFormat(("yyyy/MM/dd HH:mm:ss"));
        System.out.println(AAAA_MM_JJ_HH_mm_ss.format(date2));

        Date dateSysteme = new Date();
        System.out.println(AAAA_MM_JJ_HH_mm_ss.format(dateSysteme));

    }
}
