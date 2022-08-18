package net.da.net.k8s.service;

import lombok.RequiredArgsConstructor;
import net.da.net.k8s.dto.CatDto;
import net.da.net.k8s.entity.Cat;
import net.da.net.k8s.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        return catRepository.save(new Cat()
                .setId(UUID.randomUUID().toString())
                .setName(catDto.getName())
                .setBirthDay(catDto.getBirthDate())
                .setCreatedAt(LocalDateTime.now()));
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
