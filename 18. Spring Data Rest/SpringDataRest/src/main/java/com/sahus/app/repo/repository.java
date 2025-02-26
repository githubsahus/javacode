package com.sahus.app.repo;

import com.sahus.app.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<JobPost, Integer> {

}
