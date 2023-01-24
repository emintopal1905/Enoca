package com.enoca.Enoca.repo;

import com.enoca.Enoca.entity.Calisan;
import com.enoca.Enoca.entity.Sirket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SirketRepository  extends JpaRepository<Sirket,Long> {
    Sirket save(Sirket sirket);
}
