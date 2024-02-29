package org.example.sandbox.fluentapi;

public class WidgetDriver {
    public static void main(String[] args) {

        Widget widget = Widget.create()
                .withHeight(1.0)
                .withWidth(4.0)
                .build();
        System.out.println(widget);

    }
}
