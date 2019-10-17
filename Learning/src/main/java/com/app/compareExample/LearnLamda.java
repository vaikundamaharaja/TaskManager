package com.app.compareExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LearnLamda {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("1sad", "2as", "3asd");
		long num=names.stream().map(name -> name.length()).filter(x->x%2==0).count();
		System.out.println(num);
		Stream<Integer> lengths = names.stream().map(name -> name.length());
		lengths.forEach(x->System.out.println(x));
		
		//Map<Integer, String> empList=new HashMap<Integer, String>();
		

	}

}
