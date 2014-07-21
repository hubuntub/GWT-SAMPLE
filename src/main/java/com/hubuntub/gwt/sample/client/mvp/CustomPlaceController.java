package com.hubuntub.gwt.sample.client.mvp;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceController.DefaultDelegate;
import com.google.gwt.place.shared.PlaceController.Delegate;

public class CustomPlaceController extends PlaceController {

    public CustomPlaceController(final EventBus eventBus) {
        this(eventBus, (Delegate) GWT.create(DefaultDelegate.class));
    }

    public CustomPlaceController(final EventBus eventBus, final Delegate delegate) {
        super(eventBus, delegate);
    }

    @Override
    public void goTo(final Place newPlace) {
        if (!Place.NOWHERE.equals(newPlace)) {
            super.goTo(newPlace);
        }
    }
}
