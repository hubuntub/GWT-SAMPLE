package com.hubuntub.gwt.sample.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.hubuntub.gwt.sample.client.mvp.SampleActivityMapper;

public class CustomGinModule extends AbstractGinModule{

	@Override
	protected void configure() {
	      bind(ClientFactory.class).to(ClientFactoryImpl.class).in(Singleton.class);
	        bind(ActivityMapper.class).to(SampleActivityMapper.class).in(Singleton.class);
		
	}

}
