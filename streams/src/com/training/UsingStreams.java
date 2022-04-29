package com.training;

import java.util.List;

import com.training.model.Book;

import java.util.*;
import static java.util.stream.Collectors.*;


public class UsingStreams {
	
	public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct()
				.forEach(System.out::println);
	}
	
	public static void collectToSet(List<Book> bookList) {
		
		Set<Book> bookSet = bookList
				.stream().filter(e -> e.getPrice()>500)
				.collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	public static void collectToMap(List<Book> bookList) {
		
//		Set<Book> bookSet = bookList
//				.stream().collect(toSet());
		
		Map<String,Double> values = bookList.stream()
				.filter(e -> e.getPrice()>500).distinct()
				.collect(toMap(Book::getBookName,Book::getPrice));
		
		values.forEach((key, value) -> System.out.println(key + "," + value));
	}
	
	public static void findMaxPrice(List<Book> bookList) {
		
		Optional<Book> optional = bookList
 				.stream().max(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Maximum Price:" +optional.get().getPrice());
		}
	}
	
	public static void findMinPrice(List<Book> bookList) {
		
		Optional<Book> optional = bookList
 				.stream().min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Minimum Price:" +optional.get().getPrice());
		}
	}
	
	public static void findCount(List<Book> bookList,String srchString) {
		
		long count = bookList
				.stream().filter(e -> e.getBookName().contains(srchString))
				.count();
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java = new Book(411, "java", "sam", 450);
		Book spring = new Book(412, "spring", "ram", 550);
		Book maven = new Book(413, "maven", "dam", 650);
		Book html = new Book(414, "html", "jam", 750);
		Book python = new Book(415, "python", "cam", 850);
		Book mavenNew = new Book(413, "maven", "dam", 650);
		Book htmlNew = new Book(414, "html", "jam", 750);
		
		
		List<Book> bookList =
				Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
//		System.out.println("=========================");
//		System.out.println("============Distinct===============");
//		useDistinct(bookList);
//		
//		System.out.println("=========================");
//		System.out.println("============Set===============");
//		collectToSet(bookList);
//		
//		System.out.println("=========================");
//		System.out.println("============Map===============");
//		collectToMap(bookList);
//		
//		System.out.println("=========================");
//		System.out.println("============Maximum Price===============");
//		findMaxPrice(bookList);
		
		int key = 6;
		switch (key) {
		case 1:
			useDistinct(bookList);
			break;
		case 2:
			collectToSet(bookList);
			break;
		case 3:
			collectToMap(bookList);
			break;
		case 4:
			findMaxPrice(bookList);
			break;
		case 5:
			findMinPrice(bookList);
		case 6:
			findCount(bookList,"v");
		default:
			break;
		}
		
	}

}
