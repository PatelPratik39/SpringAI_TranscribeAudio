package com.audio.audio_transcribe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AudioTranscribeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AudioTranscribeApplication.class, args);
		System.out.println("Transcribe APp is up and running");
	}

}
