package com.bridgelabz.participants;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> subscibers = new ArrayList<>();
	private String name;
	private String Title;

	public String getname() {
		return name;
	}

	public Subject(String name) {
		super();
		this.name = name;
	}

	public void subscribe(Observer subscriber) {
		subscibers.add(subscriber);
	}

	public void unsubscribe(Observer unsubscriber) {
		subscibers.remove(unsubscriber);
	}

	public void NotifySubscribers() {

		for (Observer sub : subscibers)
			sub.update();

	}

	public void UploadVideo(String title) {
		this.Title = title;
		NotifySubscribers();
	}
}
