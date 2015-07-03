package MavenJUnitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void test_returnEuro() {
        System.out.println("Test if pricePerMonth returns Euro...") ;
        Subscription S = new Subscription(200,2) ;
        assertTrue(S.pricePerMonth() == 100.0) ;
    }

    @org.junit.Test
    public void test_roundUp() {
        System.out.println("Test if pricePerMonth rounds up correctly...") ;
        Subscription S = new Subscription(200,5) ;
        assertTrue(S.pricePerMonth() == 40) ;
    }
}
