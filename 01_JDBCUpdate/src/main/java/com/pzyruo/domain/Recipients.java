package com.pzyruo.domain;

/**
 * @ClassName Recipients
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 9:28
 * @Version 1.0
 **/
public class Recipients {
//    recipients_id	int
    private Integer recId;
//    recipients_name	varchar
    private String recName;
//    recipients_address	varchar
    private String recAdd;
//    recipients_phone	varchar
    private String recPhone;
//    recipients_user_id	int
    private Integer recUserId;
//    recipients_checked	int
    private Integer recChecked;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getRecAdd() {
        return recAdd;
    }

    public void setRecAdd(String recAdd) {
        this.recAdd = recAdd;
    }

    public String getRecPhone() {
        return recPhone;
    }

    public void setRecPhone(String recPhone) {
        this.recPhone = recPhone;
    }

    public Integer getRecUserId() {
        return recUserId;
    }

    public void setRecUserId(Integer recUserId) {
        this.recUserId = recUserId;
    }

    public Integer getRecChecked() {
        return recChecked;
    }

    public void setRecChecked(Integer recChecked) {
        this.recChecked = recChecked;
    }
}