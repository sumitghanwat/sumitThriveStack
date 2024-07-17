package com.sbcrud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbcrud.model.User;
import com.sbcrud.servicei.serviceI;

@Controller
public class To_do_Controller {

		@Autowired
		serviceI si;
		@RequestMapping("/")
		public String homepage() {
			return "default";
			
		}
		@RequestMapping("/addtask")
		public String addtaskpage() {
			return "addtask";
		}
		
		@RequestMapping("save")
		public String savepage(@ModelAttribute User u) {
			si.toSavedata(u);
			return "default";
		
		}
		
		@RequestMapping("/viewList")
		public String viewtaskpagepage() {
			return "viewList";
		
		}

	
}
