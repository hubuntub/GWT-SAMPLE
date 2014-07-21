package com.hubuntub.gwt.sample.client.history;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;

public class HistoryManager {
    private static HistoryManager instance;
    private String currentHistoryToken;
    public static synchronized HistoryManager getInstance() {
        if (instance == null) {
            instance = new HistoryManager();
        }
        return instance;
    }
    private HistoryManager() {
        History.addValueChangeHandler(new ValueChangeHandler<String>() {

			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
    }
	public void setCurrentHistoryToken(String token) {
		currentHistoryToken = token;
	}
}
