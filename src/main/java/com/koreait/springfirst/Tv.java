package com.koreait.springfirst;

public class Tv {
    private Speaker speaker;

    public Tv(Speaker speaker) {
        this.speaker = speaker;
    }

    public void volumeUp() {
        speaker.speakUp();
        printCurrentVolume();
    }

    public void volumeDown() {
        speaker.speakDown();
        printCurrentVolume();
    }

    private void printCurrentVolume() {
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }
}
