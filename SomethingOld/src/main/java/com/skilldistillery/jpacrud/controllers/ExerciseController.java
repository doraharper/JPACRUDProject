package com.skilldistillery.jpacrud.controllers;

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

	@RequestMapping(path = "index.do", method = RequestMethod.GET)
	public ModelAndView getExercise(@RequestParam(name = "fid") Integer id) {
		ModelAndView mv = new ModelAndView();
		Exercise e = dao.retrieveById(id);
		mv.addObject("exercise", e);
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}
}
