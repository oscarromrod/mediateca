package com.daw.mediateca.pelicula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Responde con datos (JSON), no con páginas HTML
@RequestMapping("/peliculas") // Todas las rutas de esta clase empiezan por/peliculas
public class PeliculaController {
    // De momento, los datos viven en memoria (en la UD5 irán a una base de datos)
    private final List<Pelicula> peliculas = List.of(
            new Pelicula(1L, "El laberinto del fauno", "Guillermo del Toro", 2006),
            new Pelicula(2L, "Parásitos", "Bong Joon-ho", 2019),
            new Pelicula(3L, "Origen", "Christopher Nolan", 2010)
    );
    @GetMapping // GET /peliculas
    public List<Pelicula> listar() {
        return peliculas; // Spring convierte la lista a JSON automáticamente
    }
}
