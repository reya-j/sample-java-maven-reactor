package com.shippable.client;

import junit.framework.*;
import static org.mockito.Mockito.*;

import com.shippable.common.MeaningOfEverythingService;

public class AppTest extends TestCase {
  public void testTelling() {
    MeaningOfEverythingService mockedService = mock(MeaningOfEverythingService.class);
    App app = new App(mockedService);

    when(mockedService.getMeaningofEverything()).thenReturn(7);
    assertEquals("The answer is 7", app.tell());
    verify(mockedService).getMeaningofEverything();
  } 
}

