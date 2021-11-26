package com.example.sfg.petclinic.bootstrap;


import com.example.sfg.petclinic.model.Owner;
import com.example.sfg.petclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.PetService;
import services.VetService;
import services.map.OwnerMap;
import services.map.PetMap;
import services.map.VetMap;

@Component
public class DataInitializr implements CommandLineRunner {
    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataInitializr() {

        ownerService = new OwnerMap();
        petService = new PetMap();
        vetService = new VetMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet1);

        System.out.println("Loaded Vets....");
    }
}
