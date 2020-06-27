package com.decorator.component;

import com.decorator.Beverage;

/**
 * 调料装饰者
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
