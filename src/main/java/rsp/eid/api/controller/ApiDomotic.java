package rsp.eid.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rsp.eid.api.model.ComputePayload;
import rsp.eid.api.utils.Utils;

@RestController
@RequestMapping(path = "/v2")
public class ApiDomotic {

	@PostMapping(path= "/stats/compute" )
	public String compute(@RequestBody ComputePayload payload) {		
		return "The biggest difference is : " +  Utils.calculateBiggestDifference(payload.getReadings());
	}
}
