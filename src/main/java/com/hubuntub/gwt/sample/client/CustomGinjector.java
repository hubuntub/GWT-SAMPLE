package com.hubuntub.gwt.sample.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(CustomGinModule.class)
public interface CustomGinjector extends Ginjector{
	ActivityMapper getActivityMapper();
	ClientFactory getClientFactory();
}
