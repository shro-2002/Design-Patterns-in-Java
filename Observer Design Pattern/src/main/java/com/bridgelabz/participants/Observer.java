package com.bridgelabz.participants;

public class Observer {
	private String Name;
	private Subject channel;

	public Observer(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void update() {
		System.out.println("Hey " + Name + " " + channel.getname() + " Uploaded a new Video");
	}

	public void subscribeChannel(Subject ch) {
		this.channel = ch;
		System.out.println("Subscribed to: " + ch.getname());
	}
}
