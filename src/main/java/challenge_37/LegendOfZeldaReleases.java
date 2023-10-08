package challenge_37;

/*
 * Enunciado: ¡Han anunciado un nuevo "The Legend of Zelda"!
 * Se llamará "Tears of the Kingdom" y se lanzará el 12 de mayo de 2023.
 * Pero, ¿recuerdas cuánto tiempo ha pasado entre los distintos
 * "The Legend of Zelda" de la historia?
 * Crea un programa que calcule cuántos años y días hay entre 2 juegos de Zelda
 * que tú selecciones.
 * - Debes buscar cada uno de los títulos y su día de lanzamiento
 *   (si no encuentras el día exacto puedes usar el mes, o incluso inventártelo)
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LegendOfZeldaReleases {

    public LegendOfZeldaReleases() {

        zeldaGames = new HashMap<>();
        zeldaGames.put("The Legend of Zelda", "02/21/1986");
        zeldaGames.put("Zelda II: The Adventure of Link", "01/14/1987");
        zeldaGames.put("The Legend of Zelda: A Link to the Past", "11/21/1991");
        zeldaGames.put("The Legend of Zelda: Link's Awakening", "06/06/1993");
        zeldaGames.put("The Legend of Zelda: Ocarina of Time", "11/23/1998");
        zeldaGames.put("The Legend of Zelda: Majora's Mask", "04/27/2000");
        zeldaGames.put("The Legend of Zelda: Oracle of Ages", "02/27/2001");
        zeldaGames.put("The Legend of Zelda: Oracle of Seasons", "02/27/2001");
        zeldaGames.put("The Legend of Zelda: The Wind Waker", "12/13/2002");
        zeldaGames.put("The Legend of Zelda: Four Swords Adventures", "06/07/2004");
        zeldaGames.put("The Legend of Zelda: The Minish Cap", "11/12/2004");
        zeldaGames.put("The Legend of Zelda: Twilight Princess", "11/19/2006");
        zeldaGames.put("The Legend of Zelda: Phantom Hourglass", "06/23/2007");
        zeldaGames.put("The Legend of Zelda: Spirit Tracks", "12/23/2009");
        zeldaGames.put("The Legend of Zelda: Skyward Sword", "11/18/2011");
        zeldaGames.put("The Legend of Zelda: A Link Between Worlds", "11/22/2013");
        zeldaGames.put("The Legend of Zelda: Tri Force Heroes", "10/22/2015");
        zeldaGames.put("The Legend of Zelda: Breath of the Wild", "03/03/2017");
        zeldaGames.put("The Legend of Zelda: Tears of the Kingdom", "05/12/2023");

    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    private int getDateInfo(Date date, String searchedValue) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (searchedValue.equals("day")) {
            day = calendar.get(Calendar.DAY_OF_MONTH);
            return day;
        } else if (searchedValue.equals("month")) {
            day = calendar.get(Calendar.MONTH);
            return day;
        } else if (searchedValue.equals("year")) {
            day = calendar.get(Calendar.YEAR);
            return day;
        } else {
            throw new IllegalArgumentException("Invalid searchedValue: " + searchedValue);
        }
    }

    public Date transformStringToDate(String keyMapName){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date releaseDate = sdf.parse(String.valueOf(zeldaGames.get(keyMapName)));
            setReleaseDate(releaseDate);
            return releaseDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void releaseDaysDifferenceJava(Date releaseDate1, Date releaseDate2) {

        Date releaseDateA;
        Date releaseDateB;

        if(releaseDate1.before(releaseDate2)){
            releaseDateA=releaseDate1;
            releaseDateB=releaseDate2;
        }else{
            releaseDateB=releaseDate1;
            releaseDateA=releaseDate2;
        }

        long millisecondsDiff = releaseDateB.getTime() - releaseDateA.getTime();
        long daysDiff = millisecondsDiff / (24 * 60 * 60 * 1000);

        long years = daysDiff / 365;
        long remainingDays = daysDiff % 365;

        System.out.println("Years between the games: " + years);
        System.out.println("Remaining days: " + remainingDays);
    }

    public void releaseDateDifference(String keyMapNameGameComparison, String keyMapNameGameComparison2) {

        Date releaseDateA = transformStringToDate(keyMapNameGameComparison);
        Date releaseDateB = transformStringToDate(keyMapNameGameComparison2);
        Date aux;
        int yearsDiff = 0;
        int dayDiff = 0;
        int dayDiffA = 0;
        int dayDiffB=0;
        int dayCorrection = 0;

        if (releaseDateA.after(releaseDateB)) {
            aux = releaseDateA;
            releaseDateA = releaseDateB;
            releaseDateB = aux;
        }

        if(releaseDateA.equals(releaseDateB)){
            System.out.println("There is no difference between the release dates");
        }else{
            if(getDateInfo(releaseDateA,"year") == getDateInfo(releaseDateB, "year")){
                dayDiff=dayDiff(releaseDateA);
            }else{
                yearsDiff = getDateInfo(releaseDateB, "year")- (getDateInfo(releaseDateA, "year") +1);
                dayDiffA = dayDiff(releaseDateA);
                dayDiffB= dayDiff(releaseDateB);
                dayCorrection = leapYearCorrection(releaseDateA, releaseDateB);
            }
        }
        dayDiff = (365 - dayDiffA + dayDiffB + dayCorrection);

        yearsDiff +=  dayDiff/365;
        dayDiff = dayDiff % 365;

        System.out.println("The difference between the release dates is: " + yearsDiff + " years and "
                + dayDiff + " days");

    }

    private int dayDiff(Date releaseDateA) {

        int monthA = getDateInfo(releaseDateA, "month");
        int dayA = getDateInfo(releaseDateA, "day");
        int dayDiff = 0;

        for (int d = dayA; d >= 1; d--) {
                dayDiff++;
        }

        //complete the base year month days
        for (int m = monthA-1; m >= 0; m--) {
            if (m == 1) { // Use the calculated month value
                dayDiff += 28;
            } else if (m == 3 || m == 5 || m == 8 || m == 10) { // Use the calculated month value
                dayDiff += 30;
            } else { // Use the calculated month value
                dayDiff += 31;
            }
        }
        return dayDiff;
    }

    private int leapYearCorrection(Date date1, Date date2){
        boolean leapyear = false;
        int dayCorrection = 0;
        int year = getDateInfo(date1, "year");
        int month1 = getDateInfo(date1, "month");
        int year2 = getDateInfo(date2, "year");
        int month2 = getDateInfo(date2, "month");

        if(isLeapYear(year) && month1>1){
            dayCorrection--;
        }else if(isLeapYear(year2) &&month2<1)
            dayCorrection--;

        for(int i=year; i<=year2; i++){
            if (isLeapYear(i)){
                dayCorrection++;
            }
        }
        return dayCorrection;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private  Map<String, String> zeldaGames;

    private Date releaseDate;
    private int day;
}
