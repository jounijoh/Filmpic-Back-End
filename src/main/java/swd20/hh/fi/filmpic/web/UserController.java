package swd20.hh.fi.filmpic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import swd20.hh.fi.filmpic.domain.User;
import swd20.hh.fi.filmpic.domain.UserRepository;
import swd20.hh.fi.filmpic.domain.UserService;

@Controller
public class UserController {
	@Autowired UserRepository userrepo;
	@Autowired UserService service;
	
	// List All Users
	@GetMapping("/allusers")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String getAllusers(Model model) {
		model.addAttribute("users", userrepo.findAll());
		
		return "userlist";
	}
	
	// Create new User
	@GetMapping("/createuser")
	public String createUser(Model model) {
		User user = new User();
		model.addAttribute(user);
		
		return "newuser";
	}
	
	// Save user
	@PostMapping("/saveuser")
	public String saveUser(Model model, User user) {
		user.setRole("USER");
		userrepo.save(user);
		return "redirect:/allphotos";
	}
	
	
	
	
	
	
	
	/*Show user Details
	@GetMapping("/userdetails")
	public String showUserDetails(@AuthenticationPrincipal ShopmeUserDetails userDetails,
            Model model) {
		String userName = userDetails.getUsername();
		User user = service.getByUsername(userName);
		model.addAttribute("user", user);
		return "userdetails";
	}
	*/
}
