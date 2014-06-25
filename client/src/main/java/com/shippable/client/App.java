package com.shippable.client;

import com.shippable.common.MeaningOfEverythingService;

public class App {
  private MeaningOfEverythingService service;

  public App(MeaningOfEverythingService service) {
    this.service = service;
  }

	public String tell() {
		return "The answer is " + service.getMeaningofEverything();
	}
}
