package com.hubuntub.gwt.sample.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CustomPlace extends Place {
	protected String token;

	public CustomPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static class Tokenizer implements PlaceTokenizer<CustomPlace> {

		@Override
		public CustomPlace getPlace(String token) {
			return new CustomPlace(token);
		}

		@Override
		public String getToken(CustomPlace place) {
			return place.getToken();
		}

	}

}
