﻿package com.devchronicles.asynchronous;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class TestLogging {
    @EJB
    MyLoggingBean logBean;

    @PostConstruct
    public void testLoggers() {
        System.out.println("비동기 호출");
        logBean.logAsync("비동기 로그");
        System.out.println("동기 호출");
        logBean.logInfo("동기 로그");
        System.out.println("완료");
    }
}