package com.in28minutes.unittesting.unit_testing.business;

import com.in28minutes.unittesting.unit_testing.data.SomeDataService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//tests should not depend on anything outside from the code environment not even for the db
//thats why have to create stubs

//maintaining stubs are difficult because for each and everytime you  have to  implement all the
// methods of the interfaces ::

//we can programmatically create class using mocks


@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

    @InjectMocks //automatically inject the mocks into the business implementation
    SomeBusinessImpl business; //class

    @Mock //mock the data service dependency
    SomeDataService dataServiceMock; //interface


    @Test
    public void calculateSumUsingDataServiceWithMockito_basic(){
         //mock of interface
        //dataServiceMock pe retriveAllData() call marenge tb  new int[] {1,2,3} chahiye
        //in mockito syntax is::

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 5;
        assertNotEquals(actualResult, expectedResult);
        System.out.println("calculateSumUsingDataServiceWithMockito_basic() passed ");
    }
    @Test
    public void calculateSumUsingDataService_empty(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
        System.out.println("calculateSumUsingDataServiceWithMockito_empty() passed");
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);
        System.out.println("calculateSumUsingDataServiceWithMockito_oneValue() passed");
    }

}
