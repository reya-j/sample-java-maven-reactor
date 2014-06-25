package com.shippable.common;

import junit.framework.*;

public class MeaningOfEverythingServiceTest extends TestCase {
  public void testMeaning() {
    MeaningOfEverythingService service = new MeaningOfEverythingService();
    assertEquals(new Integer(42), service.getMeaningofEverything());
  } 
}
