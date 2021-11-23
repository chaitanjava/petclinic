package services;

import com.example.sfg.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyId(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}