package com.hubuntub.gwt.sample.client.mvp;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryHandler.Historian;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.hubuntub.gwt.sample.client.history.HistoryManager;
import com.hubuntub.gwt.sample.shared.GWTEventBus;

public class CustomPlaceHistoryHandler extends PlaceHistoryHandler {

    public static class DefaultHistorian extends PlaceHistoryHandler.DefaultHistorian {
        @Override
        public void newItem(final String token, final boolean issueEvent) {
            HistoryManager.getInstance().setCurrentHistoryToken(token);
            super.newItem(token, issueEvent);
            GWTEventBus.EVENT_BUS.fireEvent(new DisplayActivityandPlacePanelEvent());
        }
    }

    public CustomPlaceHistoryHandler(final PlaceHistoryMapper mapper) {
        super(mapper, (Historian) GWT.create(DefaultHistorian.class));
    }

}
