package com.hubuntub.gwt.sample.shared;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;

public class GWTEventBus {

	 public static EventBus EVENT_BUS = GWT.create(SimpleEventBus.class);

}
