package MavenJUnitTest

import test1.MultiplyTwo

/**
 * Unit test for simple App.
 */
public class Test1 extends GroovyTestCase {

    //@org.junit.Test
    public void test1() {
        println("Test if pricePerMonth returns Euro...")
        def S = new Subscription()
        S.length = 2
        S.price = 100
        S.println();
        assert S.pricePerMonth() == 50.0

    }

    public void test2() {
        println("Test multiplier...")

        assert MultiplyTwo.multiply(2) == 4
    }

    public void test3() {
        //def x = 1
        //assert x == 2
        assert [[1,2,3,3,3,3,4]].first().unique() == [1,2,3,4]
    }

    public void test4() {
        def x = [1,2,3,4,5]
        assert (x << 6) == [1,2,3,4,5,6]
    }

}
