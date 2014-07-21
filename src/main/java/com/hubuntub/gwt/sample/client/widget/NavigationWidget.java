package com.hubuntub.gwt.sample.client.widget;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.VerticalPanel;

public class NavigationWidget extends Composite {

	VerticalPanel mainPanel = new VerticalPanel();

	protected Button buttonNext = new Button();
	protected Button buttonBack = new Button();
	protected FlexTable table = new FlexTable();

	
	public NavigationWidget() {
		mainPanel.setHeight("500px");
		
		mainPanel.add(buttonBack);
		mainPanel.add(table);
		mainPanel.add(buttonNext);
		initWidget(mainPanel);
	}
	
	
	public void addItem(DocumentWidget documentWidget){
		table.add(documentWidget);
	}
}
