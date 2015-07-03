package MavenJUnitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Test1 extends GroovyTestCase {

    //@org.junit.Test
    public void test_Koukis1() {
        println("Test if pricePerMonth returns Euro...")
        def S = new Subscription()
        S.length = 2
        S.price = 100
        S.println();
        assert S.pricePerMonth() == 50.0

        //def x = 1
        //assert x == 2
        assert [[1,2,3,3,3,3,4]].first().unique() == [1,2,3,4]

        def x = [1,2,3,4,5]
        assert (x << 6) == [1,2,3,4,5,6]
    }


}
