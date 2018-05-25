package priv.cjb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class DemoController {

	@RequestMapping("call")
	public List<String> call() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		return list;
	}
}
