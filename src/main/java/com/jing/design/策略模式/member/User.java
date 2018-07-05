package com.jing.design.策略模式.member;

public class User {

    private Member member;

    public void setMember(Member member){
        this.member = member;
    }

    public int attack(){
        if(null == member){
            return 0;
        } else {
            return member.attack();
        }
    }
}
