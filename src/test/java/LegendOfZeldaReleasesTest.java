import challenge_28.VendingMachine;
import challenge_28.VendingMachineProducts;
import challenge_37.LegendOfZeldaReleases;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegendOfZeldaReleasesTest {

    private LegendOfZeldaReleases legendOfZeldaReleases;
    private LegendOfZeldaReleases legendOfZeldaReleases2;

    @BeforeTest
    public void setUp() {
        legendOfZeldaReleases = new LegendOfZeldaReleases();
        legendOfZeldaReleases2 = new LegendOfZeldaReleases();
    }

    @Test
    public void releaseDaysDifferenceJavaTest(){

        legendOfZeldaReleases.transformStringToDate("The Legend of Zelda");
        legendOfZeldaReleases2.transformStringToDate("The Legend of Zelda: Tears of the Kingdom");
        legendOfZeldaReleases.releaseDaysDifferenceJava(legendOfZeldaReleases.getReleaseDate(),
                legendOfZeldaReleases2.getReleaseDate());
        System.out.println("----------------------Reverse input testing-----------------");
        legendOfZeldaReleases.releaseDaysDifferenceJava(legendOfZeldaReleases2.getReleaseDate(),
                legendOfZeldaReleases.getReleaseDate());

    }

    @Test
    public void releaseDaysDifferenceJavaLessOneYearTest(){

        legendOfZeldaReleases.transformStringToDate("The Legend of Zelda");
        legendOfZeldaReleases2.transformStringToDate("Zelda II: The Adventure of Link");
        legendOfZeldaReleases.releaseDaysDifferenceJava(legendOfZeldaReleases.getReleaseDate(),
                legendOfZeldaReleases2.getReleaseDate());
        System.out.println("----------------------Reverse input testing-----------------");
        legendOfZeldaReleases.releaseDaysDifferenceJava(legendOfZeldaReleases2.getReleaseDate(),
                legendOfZeldaReleases.getReleaseDate());

    }

    @Test
    public void datesDiffTest(){
        legendOfZeldaReleases.releaseDateDifference("The Legend of Zelda",
                "The Legend of Zelda: Tears of the Kingdom");
        System.out.println("----------------------Reverse input testing-----------------");
        legendOfZeldaReleases.releaseDateDifference("The Legend of Zelda: Tears of the Kingdom"
                ,"The Legend of Zelda");
    }

    @Test
    public void datesDiffLessOneYearTest(){
        legendOfZeldaReleases.releaseDateDifference("The Legend of Zelda",
                "Zelda II: The Adventure of Link");
    }









}
