package com.koreait.springfirst;

public class LgTv extends Tv {
    public LgTv(Speaker speaker) {//기본생성자가 없으니까~ 객체생성 안된다.
        super(speaker);
        System.out.println(" -- LgTv Created --");
    }
}
