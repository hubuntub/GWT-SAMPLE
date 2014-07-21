package com.hubuntub.gwt.sample.client;

import com.google.gwt.event.shared.EventBus;
import com.hubuntub.gwt.sample.client.mvp.CustomPlaceController;
import com.hubuntub.gwt.sample.client.view.CustomView;

public interface ClientFactory {
	public CustomView getCustomView();

	public EventBus getEventBus();

	public CustomPlaceController getPlaceController();
}
