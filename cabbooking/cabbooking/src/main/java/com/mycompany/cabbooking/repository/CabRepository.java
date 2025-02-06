package com.mycompany.cabbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.cabbooking.entity.Cab;

@Repository
public interface CabRepository extends CrudRepository<Cab, Integer>{

}
