package com.template;

import java.io.InputStream;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
