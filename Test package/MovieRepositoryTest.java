package com.realdolmen.examen.examenprogrammeren2.repository;

import com.realdolmen.examen.examenprogrammeren2.service.QueryHelper;
import com.realdolmen.examen.examenprogrammeren2.repository.MovieRepository;
import com.realdolmen.examen.examenprogrammeren2.domain.Movie;
import com.realdolmen.examen.examenprogrammeren2.exceptions.NoQueryPossibleException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MovieRepositoryTest {
    
    //TODO 
    // Deel 1 Unit testen : Er is al een deel van de repository test opgesteld. Alle gegevens die je nodig hebt staan al ingevuld.
    //Opdracht 1 : annoteer alle methoden met de juiste annotaties, zodat ze aanzien worden als test methoden. Boven sommige methoden staan tips, bekijk ze goed. 
    //Opdracht 2 : tracht alle methoden die hieronder beschreven zijn in te vullen zodat ze slagen. Tips kan je vinden in de methoden zelf.
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private MovieRepository repository;
    
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    //TODO body van de methode is correct, zorg dat de test succesvol is.
    public void findAllTestThrowsNoQueryPossibleException() throws Exception{
        //Deze code laten staan
        repository = new MovieRepository("do not change this url");
        List<Movie> movies = repository.find(QueryHelper.findAll());
        //voeg niets meer toe
    }
    
    //TODO maak een test voor MovieRepository.find()
    public void findTestSucces() throws Exception {
        //Geef als parameter de String "SELECT * FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen
    }
    
    
    //TODO maak een test voor MovieRepository.find()
    public void findTestWrongQuery() throws Exception{
        //Geef als parameter de String "SELECT tietel FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen
    }
    
}
