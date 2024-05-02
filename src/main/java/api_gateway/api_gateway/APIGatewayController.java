package api_gateway.api_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/apigateway")
public class APIGatewayController {

	@GetMapping("/getmessage")
	public String getApiGateway() throws Exception {

		String msg = "Hello API GATEWAY!!";
		return msg;

	}

}
