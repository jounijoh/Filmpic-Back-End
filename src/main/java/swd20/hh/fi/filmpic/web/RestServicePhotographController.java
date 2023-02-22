package swd20.hh.fi.filmpic.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import swd20.hh.fi.filmpic.domain.Photograph;
import swd20.hh.fi.filmpic.domain.PhotographRepository;
@CrossOrigin
@Controller
public class RestServicePhotographController {
	@Autowired PhotographRepository repository;
	
	// RESTful service to get all photographs
	@RequestMapping(value="/getphotos", method = RequestMethod.GET)
	public @ResponseBody List<Photograph> photographListRest() {
		List<Photograph> photographs = (List<Photograph>)repository.findAll();
	return  photographs;
	}

}
