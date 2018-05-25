package priv.cjb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

	@RequestMapping("demo")
	public List<String> demo() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("boy");
		return list;
	}
}
