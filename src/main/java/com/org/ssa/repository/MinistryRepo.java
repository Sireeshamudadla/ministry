package com.org.ssa.repository;

import com.org.ssa.model.Ministry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface MinistryRepo extends JpaRepository<Ministry,Integer> {
    @Transactional

     String deleteByName(String name);

   List<Ministry> findByAddress(String address);
}
