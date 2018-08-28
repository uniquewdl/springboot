package com.boot.jpa2;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boot.jpa.po.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	@Resource
	private BookDao  bookDao;
	@RequestMapping("/list")
	public  ModelAndView list(){
		ModelAndView mavAndView=new ModelAndView();
		mavAndView.addObject("bookList",bookDao.findAll());
		mavAndView.setViewName("bookList");
		return mavAndView;
	}
@RequestMapping(value="/add",method=RequestMethod.POST)
public String add(Book book) {
	bookDao.save(book);
	return "forward:/book/bookAdd";
}
@GetMapping(value="/preUpdate/{id}")
public ModelAndView preUdate(@PathVariable("id") Integer id)
{
	ModelAndView mav =new ModelAndView();
	mav.addObject("book",bookDao.getOne(id));
	mav.setViewName("bookUpdate");
	return mav;
}
/**
 * 修改图书
 * 
 */
@PostMapping(value="/update")
public String update(Book book)
{
	bookDao.save(book);
	return "forward:/book/list";
}
/**
 * 刪除删除图书
 */
@RequestMapping(value="/delete",method=RequestMethod.GET)
public  String delete(Integer id) {
	bookDao.delete(id);
	return "forward:/book/list";
}


}
