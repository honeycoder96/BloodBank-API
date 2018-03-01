package tech.honeysharma.techbme.repository;

import org.springframework.data.repository.CrudRepository;

import tech.honeysharma.techbme.modal.BloodBank;

public interface MainRepository extends CrudRepository<BloodBank, String> {

}
