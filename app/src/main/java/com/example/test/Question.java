package com.example.test;

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;
    public Question(int textResId, boolean answerTrue){
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }
    public int getTextResID() {
        return mTextResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
