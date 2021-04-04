package com.naya.mainapk.model;

public class QuesAns {
    private String ques, ans ,quesNo;
    private int image;

    public QuesAns(String ques, String ans, String quesNo) {
        this.ques = ques;
        this.ans = ans;
        this.quesNo = quesNo;
    //    this.image = image;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getQuesNo() {
        return quesNo;
    }

    public void setQuesNo(String quesNo) {
        this.quesNo = quesNo;
    }
}
