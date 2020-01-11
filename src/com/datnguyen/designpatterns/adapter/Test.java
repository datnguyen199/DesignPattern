package com.datnguyen.designpatterns.adapter;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		IteratorEnumerationAdapter adapter = new IteratorEnumerationAdapter(arr.iterator());
		while (adapter.hasMoreElements()) {
			System.out.println(adapter.nextElement());
		}
	}
}
