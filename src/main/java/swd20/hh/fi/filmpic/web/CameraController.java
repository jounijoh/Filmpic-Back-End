package swd20.hh.fi.filmpic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import swd20.hh.fi.filmpic.domain.Camera;
import swd20.hh.fi.filmpic.domain.CameraRepository;

@Controller
public class CameraController {

	@Autowired
	CameraRepository camerarepo;

	// List all cameras page
	@GetMapping("/allcameras")
	public String getAllFilms(Model model) {
		model.addAttribute("cameras", camerarepo.findAll());

		return "cameralist";

	}

	// Add new camera
	@GetMapping("/addcamera")
	public String getAddFilm(Model model) {
		model.addAttribute("camera", new Camera());

		return "addcamera";
	}
	// Save camera
	@PostMapping("/savecamera")
	public String saveCamera(Camera camera) {
		camerarepo.save(camera);

		return "redirect:/allcameras";
	}

	// Add new camera when adding photo
	@GetMapping("/addcameraforphoto")
	public String saveCameraWhenAddingPhoto(Model model) {
		model.addAttribute("camera", new Camera());

		return "addcameraforphoto";
	}
	// Save camera
	@PostMapping("/savecameraforphoto")
	public String saveFilm(Camera camera) {
		camerarepo.save(camera);

		return "redirect:/addphoto";
	}
	// Delete Camera from database
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/deletecamera/{id}")
	public String deleteCamera(@PathVariable(name = "id") Long cameraId) {

			camerarepo.deleteById(cameraId); // SQL DELETE
			return "redirect:/allcameras"; // uudelleenohjaus listaussivulle
		}
}
