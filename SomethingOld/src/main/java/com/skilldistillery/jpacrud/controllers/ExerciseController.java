package com.skilldistillery.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.ExerciseDAO;
import com.skilldistillery.jpacrud.entities.Exercise;

@Controller
public class ExerciseController {

	@Autowired
	private ExerciseDAO dao;

	@RequestMapping(path="index.do", method = RequestMethod.GET)
	public ModelAndView getAll() {
		ModelAndView mv = new ModelAndView();
		List<Exercise> exercise = dao.retrieveAll();
		mv.addObject("exercise", exercise);
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}

	
	@RequestMapping(path = "getExercise.do", method = RequestMethod.GET)
	public ModelAndView getExercise(@RequestParam(name = "fid") Integer id) {
		ModelAndView mv = new ModelAndView();
		Exercise e = dao.retrieveById(id);
		mv.addObject("exercise", e);
		mv.setViewName("WEB-INF/views/show.jsp");
		return mv;
	}
	
	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView getUpdate(Exercise exercise) {
		ModelAndView mv = new ModelAndView();
		Exercise e = dao.update(exercise);
		mv.addObject("exercise", e);
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}
//	@RequestMapping(path = "findbyKeyword.do", method = RequestMethod.POST)
//	public ModelAndView getExerciseByKeyword(@RequestParam(name="keyword") String keyword) {
//		ModelAndView mv = new ModelAndView();
//		Exercise e = dao.findByKeyword(keyword);
//		mv.addObject("exercise", e);
//		mv.setViewName("WEB-INF/views/index.jsp");
//		return mv;
//	}
	
	@RequestMapping(path = "deleteExercise.do", method = RequestMethod.POST)
	public ModelAndView getDelete(int id) {
		ModelAndView mv = new ModelAndView();
		boolean e = dao.delete(id);
		
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}
}
