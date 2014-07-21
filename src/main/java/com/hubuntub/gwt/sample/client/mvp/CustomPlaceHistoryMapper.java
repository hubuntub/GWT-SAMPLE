package com.hubuntub.gwt.sample.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.hubuntub.gwt.sample.client.place.CustomPlace;

@WithTokenizers(CustomPlace.Tokenizer.class)
public interface CustomPlaceHistoryMapper extends PlaceHistoryMapper {

}
