package services;

import com.example.sfg.petclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface PetService extends CrudService<Pet,Long>{

}
