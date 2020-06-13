package com.kendrick.angularspringboot.roko.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kendrick.angularspringboot.roko.model.SourceRef;

@Repository
public interface SourceRefRepository extends JpaRepository<SourceRef, Long>{
	Page<SourceRef> findByAnimeId(Long id, Pageable pageable);
	Optional<SourceRef> findByIdAndAnimeId(Long id, Long animeId);

}
