package com.koreait.springfirst;

public class Speaker {
    private int volume;
    private final int MAX_VOLUME;
    private final String COMPANY_NM;

    public Speaker(int max_volume, String companyNm) {//객체화
        MAX_VOLUME = max_volume;
        COMPANY_NM = companyNm;
    }

    public void speakUp() {//volume 1 올리고, maxVolume 값 보다 커지면 안된다.
        if (volume < MAX_VOLUME) {
            volume ++;
        }
    }

    public void speakDown() {//volume 1 내리고 0 보다 작아지면 안된다.
        if (volume > 0) {
            volume --;
        }

    }

    //외부에 줘야하니까 return 값이 있다, return 타입은 int
    public int getVolume() {//파라미터로 받을건 없다.
        return volume;
    }

    public void printCompanyNm() {
        System.out.println("회사명 : " + this.COMPANY_NM);//확인 시켜주려고 만든거임
    }
}
