package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Login;

@FeignClient(name = "viaemail", url = "https://viaemail.com.br/ws")
public interface ViaEmailService {

	@GetMapping("/{email}/json/")
	Login consultarEmail(@PathVariable("email") String email);
}
