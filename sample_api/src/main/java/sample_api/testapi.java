package sample_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sample_api.model.BaseResponse;

@RestController
public class testapi {
	@GetMapping("/testapi")
	public BaseResponse test() {
		BaseResponse res = new BaseResponse();
		res.setRequestId("1000000");
		res.setResponseCode("200");
		res.setResponseMessage("OK");
		
		return res;
	}
}
