package xyz.easy_coding.jackson_example;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class Foo {
    public String bar;

    public Baz baz;

    @JsonAnySetter
    public void setProp(Map<String, String> other) {
        //propというキーに紐付くオブジェクト全てが処理できる
    }
}
