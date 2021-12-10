package com.codeclan.final_project.media_app_server.repositories;

import com.codeclan.final_project.media_app_server.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
