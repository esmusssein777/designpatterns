package com.ligz.Strategy.duck;

/**
 * 实现，对应策略模式不同的算法族
 * @author ligz
 */
public class Quack implements QuackBehavior{
	public void quack() {
		System.out.println("gua gua");
	}
}
