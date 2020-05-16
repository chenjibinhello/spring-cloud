package priv.cjb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class DemoController {

	@Value("${name}")
	public String port;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("demo")
	public List<String> demo() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("boy");
		list.add(port);
		return list;
	}

	@RequestMapping("connect")
	public Object connect() {
		Object result = restTemplate.getForObject("http://localhost:8764/demo", Object.class);
		System.out.println(result);
		return result;
	}
}
