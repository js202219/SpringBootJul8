package com.jul82k24SpringBoot;

import com.jul82k24SpringBoot.jpa.entity.Book;
import com.jul82k24SpringBoot.jpa.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;


//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

//	public static void main(String[] args) {
//		ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
//		SpringbootApplication application=run.getBean(SpringbootApplication.class);
//		application.jpaOperations();
//	}

	public static void main(String[] args) {
		 SpringApplication.run(SpringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		jpaOperations();
	}

	public void jpaOperations(){

		Book book=new Book();
		book.setName("The Hidden Hindu");
		book.setAuthor("Akshat Gupta");
		book.setPages(200);
		book.setPrice(1000.0);
//		String date="2022-04-27";
		book.setPublishDate(LocalDate.now().withYear(2022).withMonth(04).withDayOfMonth(27));
//		book.setPublishDate(LocalDate.parse(date));
//		Book savedBook=bookRepository.save(book);
//		System.out.println(savedBook.getId());

		Book book1=new Book();
		book1.setName("Atomic Habit");
		book1.setAuthor("James Clear");
		book1.setPages(200);
		book1.setPrice(1000.0);
//		String date="2022-04-27";
		book1.setPublishDate(LocalDate.now().withYear(2022).withMonth(04).withDayOfMonth(27));

		Book book2=new Book();
		book2.setName("Rich Dad Poor Dad");
		book2.setAuthor("Abc");
		book2.setPages(200);
		book2.setPrice(1001.0);
//		String date="2022-04-27";
		book2.setPublishDate(LocalDate.now().withYear(2022).withMonth(04).withDayOfMonth(27));

//		book.setPublishDate(LocalDate.parse(date));
//		Book savedBook1=bookRepository.save(book1);
//		System.out.println(savedBook1.getId());
//		Iterable<Book> books = List.of(book, book1);
		List<Book> allBooks = List.of(book,book1,book2);
//		List<Book> books=new ArrayList<>();
//		books.add(book);
//		books.add(book1);
//		books.add(book2);

		Iterable<Book> books = bookRepository.saveAll(allBooks);
//		while (books.hasNext()){
//			System.out.println(books.next());
//		}

//		books.forEach(b-> {
//			System.out.println("b=="+b);
//		});


//		Iterable<Book> all = bookRepository.findAll();
//		System.out.println(all);


//		Optional<Book> getBook = bookRepository.findById(3);
//		System.out.println("getBook-"+getBook);

//		Book atomicHabit = bookRepository.findByName("Atomic Habit");
//		System.out.println(atomicHabit);
//
//		Book richDadPoorDad = bookRepository.findByIdOrName(null, "Rich Dad Poor Dad");
//		System.out.println(richDadPoorDad);

		Book atomicHabit = bookRepository.getByNames("Atomic Habit");
		System.out.println(atomicHabit);
	}
}


