package services.map;

import services.CrudService;

import java.security.acl.Owner;
import java.util.*;
import java.util.List;

public class OwnerMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public Owner save(Long id,Owner object) {
        return super.save(id, object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
