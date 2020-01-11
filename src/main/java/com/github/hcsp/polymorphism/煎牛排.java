package com.github.hcsp.polymorphism;

public class 煎牛排 extends 菜{
//    煎牛排(String name){
//        super(name);
//    }

    public void 煎个牛排() {
        System.out.println("洗煎锅");
        System.out.println("倒油");
        System.out.println("放牛排");
        System.out.println("煎啊煎啊煎");
        System.out.println("放胡椒粉");
        System.out.println("放盐");
        System.out.println("香喷喷的煎牛排出锅啦");
    }
    @Override
    public void 洗锅(){
        System.out.print("洗煎锅"+" ");
    }
    @Override
    public void 开始烹饪(){
        //菜名="牛排";
        System.out.print("放牛排"+" ");
        System.out.print("煎啊煎啊煎"+" ");
    }
    @Override
    public void 放佐料(){
        System.out.print("放胡椒粉"+" ");
        super.放佐料();
    }
    @Override
    public void 出锅(){
        菜名="牛排";
        super.出锅();
    }
}
