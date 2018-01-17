package com.test.prototype;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class SchedulerBean {

    @Resource(lookup = "jndi/testVariable")
    String testVariable;

    @Schedule(hour = "0", persistent = false)
    public void timeout() {

    }
}
