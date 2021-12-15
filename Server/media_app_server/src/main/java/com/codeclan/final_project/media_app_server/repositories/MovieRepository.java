package com.codeclan.final_project.media_app_server.repositories;

import com.codeclan.final_project.media_app_server.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {


    @Query (value="SELECT movies.* FROM movies INNER JOIN saved_movie ON movies.id = saved_movie.movie_id WHERE saved_movie.movie_list_id = ?1",nativeQuery = true)
    List<Movie> findMoviesForMovieList(Long movieListId);

    @Query (value="SELECT movies.* FROM movies WHERE title = :movieName",nativeQuery = true)

    List<Movie> searchByTitle(@Param("movieName") String movieName);
}
