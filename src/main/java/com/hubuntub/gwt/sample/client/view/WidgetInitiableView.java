package com.hubuntub.gwt.sample.client.view;

import com.google.gwt.user.client.ui.IsWidget;
import com.hubuntub.gwt.sample.shared.InitiablePanel;

public interface WidgetInitiableView<P> extends IsWidget, InitiablePanel {

    public void doInit();

    void setPresenter(P presenter);

}
