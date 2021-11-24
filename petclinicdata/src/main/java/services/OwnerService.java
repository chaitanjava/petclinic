package services;

import java.security.acl.Owner;
import java.util.Set;

public interface OwnerService extends CrudService{
    Owner findByLastName(String lastName);


}
