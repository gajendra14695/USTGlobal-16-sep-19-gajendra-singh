package com.ustglobal.libraryms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.libraryms.dto.Book;
import com.ustglobal.libraryms.dto.BookRegister;
import com.ustglobal.libraryms.dto.LibraryResponse;
import com.ustglobal.libraryms.dto.User;
import com.ustglobal.libraryms.servie.LibraryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibraryController {
	@Autowired
	private LibraryService service;

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User login(@RequestBody User user1) {
		LibraryResponse response = new LibraryResponse();
		User user = service.login(user1.getEmail(), user1.getPassword());
		return user;
	}

	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse register(@RequestBody User user) {
		LibraryResponse response = new LibraryResponse();
		if (service.registerUser(user) != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Successfully Registered");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the dataBase");

		}
		return response;

	}

	@PostMapping(path = "/addBooks", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBooks(@RequestBody Book booksDetails) {
		LibraryResponse response = new LibraryResponse();
		if (service.addBooks(booksDetails) != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Books added Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the dataBase");
			response.setBooksDetails(Arrays.asList(booksDetails));
		}
		return response;

	}

	@GetMapping(path = "/showBooks", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse showAllBooks() {
		LibraryResponse response = new LibraryResponse();
		List<Book> booksDetails = service.showAllBooks();
		if (!booksDetails.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
			response.setBooksDetails(booksDetails);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the dataBase");

		}
		return response;
	}
	
	@GetMapping(path = "/showUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse ShowAllUser() {
		LibraryResponse response = new LibraryResponse();
		List<User> user = service.ShowAllUser();
		if (!user.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
			response.setUser(user);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the dataBase");

		}
		return response;
	}

	@GetMapping(path = "/search-book/{bookName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@PathVariable("bookName") String bookName) {
		LibraryResponse response = new LibraryResponse();
		Book booksDetails = service.searchBook(bookName);
		if (booksDetails != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setBooksDetails(Arrays.asList(booksDetails));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}

	
	
	@DeleteMapping(path = "/deleteBook/{bid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@PathVariable("bid") int bid) {
		LibraryResponse response = new LibraryResponse();
		if (service.deleteBook(bid)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted from the dataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted from the dataBase");

		}
		return response;
	}

	@DeleteMapping(path = "/deleteUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteStudent(@PathVariable("id") int id) {
		LibraryResponse response = new LibraryResponse();
		if (service.deleteStudent(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted from the dataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted from the dataBase");

		}

		return response;
	}
	
	@GetMapping(path = "/getUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getStudentInfo(@PathVariable("id") int id) {
		LibraryResponse response = new LibraryResponse();
		User user = service.getStudentInfo(id);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the dataBase");
			response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the dataBase");

		}
		return response;
	}

	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public LibraryResponse updateBook(@RequestBody Book booksDetails) {
		LibraryResponse response = new LibraryResponse();
		if (service.updateBook(booksDetails)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data modify to  the dataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data  not modify to  the dataBase");
		}

		return response;
	}
	
	
	
	
	
	@PostMapping(path="/request", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestBook(@RequestParam("sid")int sid,@RequestParam("id")int id) {
		LibraryResponse response = new LibraryResponse();
		if(service.request(sid, id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Book requested");
		} else {
			response.setStatusCode(201);
			response.setMessage("failure");
			response.setDescription("Book not available");
		}
		return response;
	}
	
	@PostMapping(path="/respond",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse respondBook(@RequestParam("id")int id) {
		LibraryResponse resp = new LibraryResponse();
		if(service.respond(id)){
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book request accepted");
		}else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book request not accepted");
		}
		return resp;		
	}
	
	@DeleteMapping(path="/deleterespond", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteRespond(@RequestParam("id")int id) {
		LibraryResponse resp = new LibraryResponse();
		if(service.deleteRespond(id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book Request Rejected");
		}else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book request pending");
		}
		return resp;
	}
	
	@GetMapping(path="/bookissue",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getresponse() {
		List<BookRegister> book = service.getResponse();
		
		LibraryResponse resp = new LibraryResponse();if(book!=null){
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("All Book Issue Request");
			//resp.setIssue(book);
		}else {
			resp.setStatusCode(201);
			resp.setMessage("failure");
			resp.setDescription("Book request not accepted");
		}
		return resp;		
	}

}
