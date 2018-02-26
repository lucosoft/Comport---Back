package demo.comport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.comport.service.ComportService;
import demo.comport.service.impl.Comport;

@RestController
public class ComportController {

	@Autowired
	private ComportService comportService;

	@CrossOrigin(origins = "http://localhost:9000")
	@GetMapping("/getComPort")
	@ResponseBody
	public List<Comport> getComPort() {

		List<Comport> lista = this.comportService.getComPort();

		return lista;

	}

}
