package com.shantoo.develop.library.utils;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * 作者: shantoo on 2017/3/13 16:37.
 */

@SuppressWarnings("unused")
public class VerifyTimer extends CountDownTimer{
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    private TextView verify;
    private int checkAbleColor;
    private int unCheckAbleColor;
    private int checkAbleBackGround;
    private int unCheckAbleBackGround;

    public VerifyTimer(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    public VerifyTimer(long millisInFuture, long countDownInterval,
                       TextView verify,
                       int unCheckAbleColor, int unCheckAbleBackGround,
                       int checkAbleColor, int checkAbleBackGround) {
        super(millisInFuture, countDownInterval);
        this.verify = verify;
        this.checkAbleColor = checkAbleColor;
        this.unCheckAbleColor = unCheckAbleColor;
        this.checkAbleBackGround = checkAbleBackGround;
        this.unCheckAbleBackGround = unCheckAbleBackGround;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        verify.setBackgroundResource(unCheckAbleBackGround);
        verify.setTextSize(13);
        String text = millisUntilFinished / 1000 +"秒";
        verify.setText(text);
        verify.setTextColor(unCheckAbleColor);
        verify.setClickable(false);
    }

    @Override
    public void onFinish() {
        verify.setBackgroundResource(checkAbleBackGround);
        verify.setTextSize(13);
        verify.setText("获取验证码");
        verify.setTextColor(checkAbleColor);
        verify.setClickable(true);
    }
}
