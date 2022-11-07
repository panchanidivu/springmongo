package mongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mongo.demo.model.AppBook;
@Repository
public interface BookRepositoery extends MongoRepository<AppBook,Long> {

    AppBook findByBookName(String bookName);
    
}
