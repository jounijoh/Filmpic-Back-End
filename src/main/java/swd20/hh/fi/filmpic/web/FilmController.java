package swd20.hh.fi.filmpic.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import swd20.hh.fi.filmpic.domain.Film;
import swd20.hh.fi.filmpic.domain.FilmRepository;

@Controller
public class FilmController {

	@Autowired
	FilmRepository filmrepo;

	// List all films page
	@GetMapping("/allfilms")
	public String getAllFilms(Model model) {
		model.addAttribute("films", filmrepo.findAll());

		return "filmlist";

	}

	// Add new film
	@GetMapping("/addfilm")
	public String getAddFilm(Model model) {
		model.addAttribute("film", new Film());

		return "addfilm";
	}

	// Save new film
	@PostMapping("/savefilm")
	public String saveFilm(Film film) {
		filmrepo.save(film);

		return "redirect:/allfilms";
	}

	// Add new film when adding photgraph
	@GetMapping("/addfilmforphoto")
	public String getAddFilmForPhoto(Model model) {
		model.addAttribute("film", new Film());

		return "addfilmforphoto";
	}

	// Save new film when adding photo
	@PostMapping("/savefilmforphoto")
	public String saveFilm(HttpServletRequest request, Film film) {
		filmrepo.save(film);

		return "redirect:/addphoto";
	}

	// Delete Film from database
	@GetMapping("/deletefilm/{id}")
	public String deleteBook(@PathVariable(name = "id") Long filmId) {

		filmrepo.deleteById(filmId); // SQL DELETE
		return "redirect:/allfilms"; // uudelleenohjaus listaussivulle
	}

}
