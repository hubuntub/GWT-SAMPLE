package com.hubuntub.gwt.sample.client.view;

public interface CustomView extends WidgetInitiableView<CustomView.Presenter> {
	void setPresenter(Presenter presenter);

	public interface Presenter {
		void create();

		void cancel();
	}
}
