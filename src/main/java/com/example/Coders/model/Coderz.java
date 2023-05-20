package com.example.Coders.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Coderz {

    Long id;
    String name;

}
