package com.pzyruo.domain;

import java.util.List;

/**
 * @ClassName Funs
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 14:28
 * @Version 1.0
 **/
public class Funs {
    // fun_id int
    private int funId;
    // fun_name varchar
    private String funName;
    // fun_url varchar
    private String funUrl;
    // fun_pid int
    private Funs pfun;
    // fun_target varchar
    private String funTarget;
    // fun_sort int
    private int funSort;
    // fun_level int
    private int funLevel;
    private List<Funs> funList;//当前节点的子节点集合

    public int getFunId() {
        return funId;
    }

    public void setFunId(int funId) {
        this.funId = funId;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getFunUrl() {
        return funUrl;
    }

    public void setFunUrl(String funUrl) {
        this.funUrl = funUrl;
    }

    public Funs getPfun() {
        return pfun;
    }

    public void setPfun(Funs pfun) {
        this.pfun = pfun;
    }

    public String getFunTarget() {
        return funTarget;
    }

    public void setFunTarget(String funTarget) {
        this.funTarget = funTarget;
    }

    public int getFunSort() {
        return funSort;
    }

    public void setFunSort(int funSort) {
        this.funSort = funSort;
    }

    public int getFunLevel() {
        return funLevel;
    }

    public void setFunLevel(int funLevel) {
        this.funLevel = funLevel;
    }

    public List<Funs> getFunList() {
        return funList;
    }

    public void setFunList(List<Funs> funList) {
        this.funList = funList;
    }
}