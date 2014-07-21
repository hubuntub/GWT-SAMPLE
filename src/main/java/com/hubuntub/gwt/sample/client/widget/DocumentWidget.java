package com.hubuntub.gwt.sample.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.hubuntub.gwt.sample.client.Resources;

public class DocumentWidget extends Composite {
	Resources resources = GWT.create(Resources.class);
	VerticalPanel mainPanel = new VerticalPanel();
	Image image = new Image();
	
	public DocumentWidget(String caption){
		image.setResource(resources.amule());
		image.setSize("64px", "64px");
		Label label = new Label(caption);
		mainPanel.add(label);
		mainPanel.add(image);
		initWidget(mainPanel);
		
	}
}
