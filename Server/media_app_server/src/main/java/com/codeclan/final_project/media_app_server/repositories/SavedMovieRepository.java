package com.codeclan.final_project.media_app_server.repositories;

import com.codeclan.final_project.media_app_server.models.SavedMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedMovieRepository extends JpaRepository<SavedMovie, Long> {

}
