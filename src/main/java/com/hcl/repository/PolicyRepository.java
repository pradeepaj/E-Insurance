package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

	@Query(value = "select name from lic_policy", nativeQuery = true)
	List<String> findPolicyName();

	Policy findByName(String name);

}
