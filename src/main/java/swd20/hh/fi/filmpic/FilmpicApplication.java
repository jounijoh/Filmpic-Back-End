package swd20.hh.fi.filmpic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import swd20.hh.fi.filmpic.domain.Camera;
import swd20.hh.fi.filmpic.domain.CameraRepository;
import swd20.hh.fi.filmpic.domain.Film;
import swd20.hh.fi.filmpic.domain.FilmRepository;
import swd20.hh.fi.filmpic.domain.Photograph;
import swd20.hh.fi.filmpic.domain.PhotographRepository;
import swd20.hh.fi.filmpic.domain.User;
import swd20.hh.fi.filmpic.domain.UserRepository;

@SpringBootApplication
@EnableEncryptableProperties
public class FilmpicApplication {
	private static final Logger log = LoggerFactory.getLogger(FilmpicApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FilmpicApplication.class, args);
	}

	@Bean
	public CommandLineRunner filmPicDemo(PhotographRepository photorepository, FilmRepository filmrepo, 
			CameraRepository camerarepo, UserRepository userrepo) {
		return (args) -> {
			/*
			 log.info("Tallennetaan pari filmiä, kameraa, käyttäjää ja valokuvaa");
			 
			 User user = new User("mikko", "mallikas", "user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "user@email", "USER");
			 User admin = new User("Jouni","Johansson", "jounijoh", "$2a$12$uuLlv3/gd5bOvsXtZpLhgOhfi3YKHBB8JRodKnwU3ICrAf4bc.3ba", "jj@email.com", "ADMIN");
			 userrepo.save(user);
			 userrepo.save(admin);
			 
			 Film ilfordHp = new Film("Ilfor hp", "Black and white Negative", 400);
			 Film lomo400 = new Film("Lomography 400", "Color Negative", 400);
			 Film fujisuperia = new Film("Fuji Superia X-tra", "Color Negative", 400);
			 filmrepo.save(lomo400);
			 filmrepo.save(ilfordHp);
			 filmrepo.save(fujisuperia);
			 
			 Camera olympusXa = new Camera("Olympus XA", "35mm");
			 Camera olympusOm4 = new Camera("Olympus OM4ti", "35mm");
			 Camera bronica = new Camera("Bronica SQ-A", "6x6");
			 camerarepo.save(olympusXa);
			 camerarepo.save(olympusOm4);
			 camerarepo.save(bronica);
			 
			 photorepository.save(new Photograph("Tripla sunset", "Sunset in Tripla", "/images/Triplasunset.jpg/", fujisuperia, olympusOm4, admin));
			 photorepository.save(new Photograph("Staircase", "Kid with his mom in staircase", "/images/Staircase.jpg/", ilfordHp, olympusXa, admin));
			 photorepository.save(new Photograph("Puuhamaa", "Puuhamaa", "/images/Puuhamaa.jpg/", lomo400, bronica, admin));
			 log.info("Haetaan kuvat");
			 for (Photograph photo : photorepository.findAll()) {
				 log.info(photo.toString());
			 }*/
		
	};
}
		
}