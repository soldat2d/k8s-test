package net.da.net.k8s.repository;

import net.da.net.k8s.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {

}
