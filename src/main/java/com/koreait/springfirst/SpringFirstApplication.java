package com.koreait.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {

    public static void main(String[] args) {
        String path = "classpath:applicationContext.xml";
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
        /*
        Speaker speaker = ctx.getBean("haman", Speaker.class);//Spring Container
        speaker.printCompanyNm();
        System.out.println("--------------------------");
        Speaker speaker2 = (AppleSpeaker)ctx.getBean("apple");//Object 형태를 AppleSpeaker 로 형변환
        speaker2.printCompanyNm();

        System.out.println("--------------------------");
        Speaker speaker3 = (HamanSpeaker) ctx.getBean("haman");//HamanSpeaker 로 리턴
        System.out.println(speaker == speaker3);

        System.out.println("--------------------------");
        Speaker speaker4 = ctx.getBean("apple", AppleSpeaker.class);//Object 로 리턴
        System.out.println(speaker2 == speaker4);
        */

        Tv tv = ctx.getBean(LgTv.class);
        System.out.println(tv);

//      SpringApplication.run(SpringFirstApplication.class, args);//boot 실행
    }

}
