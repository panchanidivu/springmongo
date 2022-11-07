package mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mongo.demo.dto.BookDTO;
import mongo.demo.model.AppBook;
import mongo.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/createBook")
    public String createBook(@RequestBody BookDTO bookDTO){
        
        return bookService.createBook(bookDTO);
    }

    @GetMapping("/getAllBooks")
    public List<BookDTO> getAll(){
        return bookService.getAllBook();
    }

    
    @GetMapping(value="/getBookByName")
    public BookDTO getMethodName(@RequestParam String bookName) {
        return bookService.getByBookName(bookName);
    }



    
}
