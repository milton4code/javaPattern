package com.milton.pattern.buider;

/**
 * 测试构建者模式
 */
public class TestBuilder {

    public static void main(String[] args) {
        DoDoContact ddc = new DoDoContact.Builder("Ace").age(10)
                .address("beijing").build();
        System.out.println("name=" + ddc.getName() + "age =" + ddc.getAge()
                + "address" + ddc.getAddress());
    }
}
