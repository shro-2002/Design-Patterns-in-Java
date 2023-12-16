package com.bridgelabz.participants;

public class Main {

	public static void main(String[] args) {
		Subject HBO = new Subject("HBO");

		// subscribers
		Observer sub1 = new Observer("Rhaenyra");
		Observer sub2 = new Observer("Daemon");
		Observer sub3 = new Observer("Alicent");
		Observer sub4 = new Observer("Rhaneys");
		Observer sub5 = new Observer("Aegon");

		// Subscribe to the channel
		sub1.subscribeChannel(HBO);
		sub2.subscribeChannel(HBO);
		sub3.subscribeChannel(HBO);
		sub4.subscribeChannel(HBO);
		sub5.subscribeChannel(HBO);

		System.out.println();
		// Add subscribers
		HBO.subscribe(sub1);
		HBO.subscribe(sub2);
		HBO.subscribe(sub3);
		HBO.subscribe(sub4);
		HBO.subscribe(sub5);

		// Upload Video
		HBO.UploadVideo("House of Dragons Season 2 Trailer");

	}

}
