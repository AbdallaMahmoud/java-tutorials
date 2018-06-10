package com.abdallamahmoud.lombook;

public class Main {

    public static void main(String[] args) {
//        Message msg = new Message();
//        msg.setTitle("hello lombok");
//        msg.setBody("i like auto generated getters/setters!");

        Message msg = new Message("hello lombok", "i like auto generated getters/setters!");
        System.out.println(msg.getTitle());
        System.out.println(msg.getBody());

        Message msg2 = new Message();
    }

}
