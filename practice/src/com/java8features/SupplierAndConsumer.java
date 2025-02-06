package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierAndConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr = x -> x% 2==0; //integer passed
		Function <Integer,Integer> fun = x -> x*x; //returns and accepts integer
		Consumer<Integer> cons = x -> System.out.println(x); //pass or consumes argument
		Supplier<Integer> supp = () -> 100; //no arguments needed to pass it only returns

		if (pr.test(supp.get())) {
			cons.accept(fun.apply(supp.get()));
		}
	}

}
