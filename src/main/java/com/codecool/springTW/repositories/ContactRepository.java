package com.codecool.springTW.repositories;

import com.codecool.springTW.models.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactDetails, Long> {

}