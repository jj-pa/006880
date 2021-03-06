﻿package com.devchronicles.observer;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class TraceObserver {
    public void serviceTrace(@Observes String message) {
        System.out.println("서비스 메시지: " + message);
    }
}