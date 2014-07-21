package com.hubuntub.gwt.sample.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.hubuntub.gwt.sample.client.ClientFactory;
import com.hubuntub.gwt.sample.client.activity.CustomActivity;
import com.hubuntub.gwt.sample.client.place.CustomPlace;

public class SampleActivityMapper implements ActivityMapper {
	@Inject
	private ClientFactory clientFactory;

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof CustomPlace) {
			return new CustomActivity((CustomPlace) place, clientFactory);
		}
		return null;
	}

}
