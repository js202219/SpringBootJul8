package com.jul82k24SpringBoot.jpa.repo;

import com.jul82k24SpringBoot.jpa.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

    Book findByName(String name);

    Book findByIdOrName(Integer id,String name);

    @Query(value = "select * from book where name=?",nativeQuery = true)
    Book getByNames(String name);

}
