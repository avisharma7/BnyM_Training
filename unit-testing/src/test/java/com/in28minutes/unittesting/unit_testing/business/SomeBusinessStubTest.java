package com.in28minutes.unittesting.unit_testing.business;
import com.in28minutes.unittesting.unit_testing.data.SomeDataService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//tests should not depend on anything outside from the not not even for the db
//thats why have to create stubs

//maintaining stubs are difficult because for each and everytime you  have to  implement all the
// methods of the interfaces ::

//we can programmatically create class using mocks


class SomeDataServiceStub  implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3};
    }
}

class SomeDataServiceEmptyStub  implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {};
    }
}

class SomeDataServiceOneElementStub  implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {1};
    }
}

public class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 5;
        assertNotEquals(actualResult, expectedResult);
        System.out.println("calculateSumUsingDataService_basic() passed ");
    }
    @Test
    public void calculateSumUsingDataService_empty(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceEmptyStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
        System.out.println("calculateSumUsingDataService_empty() passed");
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceOneElementStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);
        System.out.println("calculateSumUsingDataService_oneValue() passed");
    }

}
