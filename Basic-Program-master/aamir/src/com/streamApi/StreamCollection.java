package com.streamApi;

import java.lang.invoke.CallSite;
import java.security.AlgorithmParameterGenerator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollection {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> listEven = new ArrayList<>();
		Collections.addAll(list, 2, 4, 3, 5, 6, 8, 7);
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				listEven.add(integer);// this code called broiler code means largest Line code
			}
		}
		List<Integer> FindEvenNo = listEven.stream().filter(findEvenNumber -> findEvenNumber %2 == 0).collect(Collectors.toList());
		FindEvenNo.forEach(evenIterate -> System.out.println("even no is !!!!!"+evenIterate));
		System.out.println("All no " + list);
		System.out.println("even no in list " + listEven);// without using Stream
		System.out.println();
		System.out.println();
		System.out.println("-------------------------");

		// filter by StreamApi
		List<Integer> evenList = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		evenList.forEach(e -> System.out.println(" even number of list by Stream Api = " + e));
		evenList.forEach(System.out::println);

		Stream<Integer> stream = list.stream();
		List<Integer> collect = stream.filter(w -> w % 2 == 0).collect(Collectors.toList());
		// we can not reuse streamApi
		collect.forEach(System.out::println);

		// getting the number which is greater than 5
		System.out.println();
		System.out.println();
		System.out.println("_____________________");
		List<Integer> collect2 = list.stream().filter(a -> a > 3).collect(Collectors.toList());
		System.out.println("Number is the greater than 3 = " + collect2);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("_______________________");
		List<Boolean> collect3 = list.stream().map(z -> z > 4).collect(Collectors.toList());
		System.out.println(collect3);
		// [false, false, false, true, true, true, true]

		List<String> list2 = new ArrayList<>();

		Collections.addAll(list2, "zeeshan", "aamir khan", "aasim khan", "aaquib khan", "furqan khan", "salman khan");
		List<String> collect4 = list2.stream().filter(a -> a.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect4);
		System.out.println("------------------------");
		List<String> collect5 = list2.stream().sorted().collect(Collectors.toList());
		collect5.forEach(System.out::println);
		System.out.println("*******************************88");
		System.out.println();
		long count = list2.stream().filter(x -> x.length() > 10).count();
		System.out.println(count);
		System.out.println();
		System.out.println("-----------------------------");
		List<String> collect6 = list2.stream().filter(p -> p.length() <= 7).collect(Collectors.toList());
		collect6.forEach(System.out::println);
		System.out.println("////////////////////");
		List<Integer> list3 = new ArrayList<>();
		Collections.addAll(list3, 2, 4, 7, 9, 3, 1, 4, 5, 0);
		/*
		 * List<Integer> collect7 =
		 * list3.stream().filter(s->s%2==0).collect(Collectors.toList()); List<Integer>
		 * collect8 = collect7.stream().map(w->w*3).collect(Collectors.toList());
		 * collect8.forEach(System.out::println);
		 */
		List<Integer> collect7 = list3.stream().map(q->q*3).filter(even->even%2==0).collect(Collectors.toList());
		collect7.forEach(j->System.out.println(j));
		
		List<Integer> arrayList = new ArrayList<>();
		Collections.addAll(arrayList, 1,2,3,4,5,6,7,8,9,10);
		arrayList.forEach(System.out::print);
		
		
	}

}
