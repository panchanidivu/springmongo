package mongo.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import mongo.demo.dto.BookDTO;
import mongo.demo.model.AppBook;
import mongo.demo.repository.BookRepositoery;

@Service
public class BookService {

    @Autowired
    BookRepositoery bookRepositoery;

    public String createBook(BookDTO bookDTO) {
       AppBook book = new AppBook();
       book.setBookName(bookDTO.getBookName());
       book.setOther(bookDTO.getOther());
       book.setSubject(bookDTO.getSubject());
       bookRepositoery.save(book);
       return "book Create";
    }

    public List<BookDTO> getAllBook() {
        List<BookDTO> bookDto= new ArrayList<>();
        List<AppBook> appBooks = bookRepositoery.findAll();
        ModelMapper mapper = new ModelMapper();
        for(AppBook bookDTO2 : appBooks){
            BookDTO bookDTO= mapper.map(bookDTO2, BookDTO.class);
            bookDto.add(bookDTO);
            
        }
        return bookDto;
        
    }


    
}
