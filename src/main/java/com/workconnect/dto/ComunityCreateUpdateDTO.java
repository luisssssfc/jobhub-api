package com.workconnect.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

@Data
public class ComunityCreateUpdateDTO {
    private Integer id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(message = "El nombre de la comunidad debe tener 50 caracteres", max = 50)
    private String name;

    private String description;
    private Integer membersCount;
    private Boolean isPrivate;
}

