package net.da.net.k8s.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDto {
    private String name;
    private LocalDate birthDate;
}
