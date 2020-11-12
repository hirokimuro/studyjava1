package com.example.demo;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController {
	@RequestMapping(value="/for")
	public ModelAndView forStudyPost(ModelAndView mv) {
		ArrayList<String[]>customers=new ArrayList<String[]>();
		customers.add(new String[] {"佐藤HTML太郎","35歳","男性","北海道"});
		customers.add(new String[] {"鈴木Java五郎","24歳","男性","山口"});
		customers.add(new String[] {"高橋CSS子","29歳","女性","東京"});
		customers.add(new String[] {"高橋子","2歳","女性","大阪"});
		customers.add(new String[] {"高子","72歳","女性","広島"});
		mv.addObject("customers",customers);
		mv.setViewName("forStudy");
		return mv;
	}

}
