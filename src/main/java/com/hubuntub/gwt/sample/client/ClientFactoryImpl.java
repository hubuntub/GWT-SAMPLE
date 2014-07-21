package com.hubuntub.gwt.sample.client;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.hubuntub.gwt.sample.client.mvp.CustomPlaceController;
import com.hubuntub.gwt.sample.client.view.CustomView;
import com.hubuntub.gwt.sample.shared.GWTEventBus;
import com.hubuntub.gwt.sample.shared.InitiablePanel;

public class ClientFactoryImpl implements ClientFactory {
	private final EventBus eventBus = GWTEventBus.EVENT_BUS;
	private final CustomPlaceController placeController = new CustomPlaceController(
			eventBus);

	private CustomView customView;

	@Inject
	public ClientFactoryImpl(final CustomView customView) {
		this.customView = customView;
	}

	public EventBus getEventBus() {
		return eventBus;
	}

	public CustomPlaceController getPlaceController() {
		return placeController;
	}

	public CustomView getCustomView() {
		return initView(customView);
	}
	
	  private <T extends InitiablePanel> T initView(final T view) {
	        if (!view.isInit()) {
	            view.init();
	        }
	        return view;
	    }

}
