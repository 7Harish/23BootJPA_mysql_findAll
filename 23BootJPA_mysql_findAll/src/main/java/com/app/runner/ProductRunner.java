package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepo;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		/*
		repo.save(new Product(7,"F11",7.3));
		repo.save(new Product(8,"H11",6.3));
		repo.save(new Product(9,"I11",5.3));
		repo.save(new Product(10,"J11",0.3));*/
		/***1...to fetch all data***/
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		//or
		//repo.findAll().forEach(System.out::println);
		//or
		/*
		for (Product product : list) {
			System.out.println(product);
		}*/

		/***2...to print data based on variable desending order*****/
		//List<T> findAll(Sort sort)
		//public static Sort by(Sort.Direction direction,String... properties)
		//ASC DESC 
		/*List<Product> sort=repo.findAll(Sort.by(Direction.DESC, "prodCode"));
		sort.forEach(System.out::println);*/
		//or
		//repo.findAll(Sort.by(Direction.DESC, "prodID")).forEach(System.out::println);;
		/***If we dont give ordet then it gonna be printed asending order*****/
		//repo.findAll(Sort.by("prodID")).forEach(System.out::println);

		/***3...to print data based on variable asending order*****/
		//repo.findAll(Sort.by(Order.desc("prodID"))).forEach(System.out::println);;

		/*****4... for pagination******/
		//public Page<T> findAll(Pageable pageable):SimpleJpaRepository<T,ID>
		//public static PageRequest of(int page,int size):PageRequest
		//repo.findAll(PageRequest.of(2, 3)).forEach(System.out::println);

		/****5.1...to print row based on columns ,it selects only not null values***/
		//static <T> Example<T> of(T probe):Factory method
		//<S extends T> List<S> findAll(Example<S> example):JpaRepository
		/*Product p=new Product();
		p.setProdCode("AA");
		Example<Product> ex=Example.of(p);	
		repo.findAll(ex).forEach(System.out::println);;*/
		
		/****5.2...to print row based on columns ,it selects only not null values with descending/acending order***/
		//<S extends T> List<S> findAll(Example<S> example,Sort sort)
		//public static Sort by(Sort.Direction direction,String... properties)
		/*Product p=new Product();
		p.setProdCode("AA");
		Example<Product> ex=Example.of(p);
		repo.findAll(ex, Sort.by(Direction.DESC, "prodID")).forEach(System.out::println);;*/
		
		/****5.3...to print row based on columns ,it selects only not null values with with pagination concept***/
		/*Product p=new Product();
		p.setProdCode("AA");
		Example<Product> ex=Example.of(p);
		repo.findAll(ex, PageRequest.of(0, 3)).forEach(System.out::println);;*/
		/*********6...*********/
		
		//repo.findAllById(Arrays.asList(1,3,5,9)).forEach(System.out::println);

	}

}
