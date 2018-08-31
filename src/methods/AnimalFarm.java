package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		for(int i =1 ;i>0;i++) {
		String input= JOptionPane.showInputDialog("What animal sound do you want to here?");
		/* 2. Make it so that the user can keep entering new animals. */

		if (input.equals("moo")    ) {
			playMoo();	}
	

		if (input.equals("woof")    ) {
			playWoof();	}

		if (input.equals("quack")    ) {
			playQuack();	}

		if (input.equals("meow")    ) {
			playmeow();	}

		if (input.equals("llama")    ) {
			playllama();	}
		}

	}
	
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	
	void playllama() {
		playNoise(llamaFile);
	}
	
	void playmeow() {
		playNoise(meowFile);
	}
	
	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
