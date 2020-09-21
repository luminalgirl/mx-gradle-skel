package mx.nic.service;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/person")
public class PersonController {
	@Get
	@Produces(MediaType.TEXT_PLAIN)
	public String index() {
		return "Person";
	}
}