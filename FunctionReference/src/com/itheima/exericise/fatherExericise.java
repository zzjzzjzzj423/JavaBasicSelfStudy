package com.itheima.exericise;

public class fatherExericise {

    public boolean filterRule(String rule) {
        if(rule.startsWith("张")&&rule.length()==3){
            return true;
        }else {
            return false;
        }
    }
}
