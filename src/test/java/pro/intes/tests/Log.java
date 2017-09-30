package pro.intes.tests;

public class Log
{
    public static void logTCTestSuiteStart( String message )
    {
        System.out.println( "##teamcity[testSuiteStarted name='" + message + "']" );
    }

    public static void logTCTestSuiteFinished( String message )
    {
        System.out.println( "##teamcity[testSuiteFinished name='" + message + "']" );
    }

    public static void logTCTestStart( String message )
    {
        System.out.println( "##teamcity[testStarted name='" + message + "']" );
    }

    public static void logTCTestFinished( String message )
    {
        System.out.println( "##teamcity[testFinished name='" + message + "']" );
    }

    public static void logTCTestFailed( String message, AssertionError e )
    {
        System.out.println(
                "##teamcity[testFailed name='" + message + "' message='" + e.getMessage() + "']" );
    }
}