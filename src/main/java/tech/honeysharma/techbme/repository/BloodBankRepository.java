package tech.honeysharma.techbme.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tech.honeysharma.techbme.modal.BloodBank;

public interface BloodBankRepository extends CrudRepository<BloodBank, String> {

	public List<BloodBank> findBycity(String city);

	public List<BloodBank> findBycategory(String category);

	public List<BloodBank> findBydistrict(String district);

	public List<BloodBank> findBypincode(String pincode);

	public List<BloodBank> findBystate(String state);

}
