package com.in28minutes.unittesting.unit_testing.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

import java.util.List;

public class ListMockTest {
    List<String> mock = mock(List.class);

    @Test
    public void size_basic(){
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());
    }

    @Test
    public void returnDifferentValues(){
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, mock.size());
        assertEquals(10,mock.size());
    }

    @Test
    public void returnWithParameters(){
        when(mock.get(0)).thenReturn("in28minutes");
        assertEquals(mock.get(0), "in28minutes");
        assertEquals(null,mock.get(1)); //null for other than speicified
    }


    @Test
    public void returnWithGenericParamter(){
        when(mock.get(anyInt())).thenReturn("in28minutes");
        //anyInt() means any int parameter
        assertEquals(mock.get(1), "in28minutes");
    }

    @Test
    public void verificationBasics(){
        String value =  mock.get(0);
        String vvalue =  mock.get(1);
        verify(mock).get(0); //checks if the get(0) method was called on mock at least once.
        //verify(mock).get(anyInt());
        verify(mock,times(2)).get(anyInt());
        verify(mock,atLeast(1)).get(anyInt());
    }
}
