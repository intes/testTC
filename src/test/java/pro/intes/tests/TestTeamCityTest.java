package pro.intes.tests;

import org.junit.*;

import static org.junit.Assert.*;

public class TestTeamCityTest {
    private TestTeamCity testTeamCity;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BBBefore run TestTeamCityTest");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AAAfter run TestTeamCityTest");
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
        Log.logTCTestStart( "Start testing Sum" );
        assertEquals(testTeamCity.getSum(5,9),14);
        Log.logTCTestFinished( "End testing Sum" );
    }

}