package com.koreait.springfirst;

public class AppleSpeaker extends Speaker {//부모, Speaker 에는 기본생성자가 없다.
    public AppleSpeaker() {//그래서 부모가 가지는 생성자를 호출한다.
        super(50, "애플");
        System.out.println("---- AppleSpeaker Created ----");
    }
}
