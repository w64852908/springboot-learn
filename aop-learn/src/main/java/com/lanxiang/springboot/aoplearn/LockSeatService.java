package com.lanxiang.springboot.aoplearn;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

/**
 * Created by lanxiang on 2018/1/3.
 */

@Service
public class LockSeatService implements ILockSeatService {

    @CatReport(name = "lockSeat")
    @Override
    public String lockSeat() {
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "lockSeatSuccess";
    }
}
