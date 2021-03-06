package com.exercisenice.repositories;

import com.exercisenice.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {

    Document findByLabel(String label);

}
