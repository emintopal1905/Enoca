package com.enoca.Enoca.repo;

import com.enoca.Enoca.entity.Calisan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalisanRepository extends JpaRepository<Calisan,Long> {

    Calisan save(Calisan calisan);
}
