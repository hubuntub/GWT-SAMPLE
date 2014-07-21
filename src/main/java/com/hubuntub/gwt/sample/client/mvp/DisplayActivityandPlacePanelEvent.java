package com.hubuntub.gwt.sample.client.mvp;

import com.google.gwt.event.shared.GwtEvent;

public class DisplayActivityandPlacePanelEvent extends GwtEvent<DisplayActivityandPlacePanelHandler> {

    public static final Type<DisplayActivityandPlacePanelHandler> TYPE = new Type<DisplayActivityandPlacePanelHandler>();

    public DisplayActivityandPlacePanelEvent() {
    }

    @Override
    protected void dispatch(final DisplayActivityandPlacePanelHandler handler) {
        handler.displayActivityandPlacePanel(this);
    }

    @Override
    public Type getAssociatedType() {
        return TYPE;
    }
    
}