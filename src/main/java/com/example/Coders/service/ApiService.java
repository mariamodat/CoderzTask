package com.example.Coders.service;

import com.example.Coders.model.Coderz;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.Optional;

public interface ApiService {
    void createNewUser(Coderz coder);
    Optional<Coderz> getCoderById(Long id);
}
