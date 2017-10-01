package pro.intes.tests;

import org.junit.*;

import static org.junit.Assert.*;

public class TestTeamCityTest {
    private TestTeamCity testTeamCity;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("До TestTeamCityTest");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("После TestTeamCityTest");
    }

    @Before
    public void initTest() {
        testTeamCity = new TestTeamCity();
    }

    @After
    public void afterTest() {
        testTeamCity = null;
    }

    @Test
    public void printHello() throws Exception {
        testTeamCity.printHello();
        assertTrue(true);
    }

    @Test
    public void getSum() throws Exception {
        Log.logTCTestStart( "Начало тестирование суммирования" );
        assertEquals(testTeamCity.getSum(5,9),15);
        Log.logTCTestFinished( "Конец тестирования суммирования" );
    }

}