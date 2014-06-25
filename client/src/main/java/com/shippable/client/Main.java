package com.shippable.client;

import com.shippable.common.MeaningOfEverythingService;

public class Main {
  public static void main () {
    MeaningOfEverythingService service = new MeaningOfEverythingService();
    App app = new App(service);
    System.out.println(app.tell());
  }
}
