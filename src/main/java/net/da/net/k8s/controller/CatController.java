package net.da.net.k8s.controller;

import lombok.RequiredArgsConstructor;
import net.da.net.k8s.dto.CatDto;
import net.da.net.k8s.entity.Cat;
import net.da.net.k8s.service.CatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cats")
public class CatController {

    private final CatService catService;
    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
