package com.item.management.central.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.item.management.central.entity.LookupItem;


@Service
public interface LookupItemRepo extends JpaRepository<LookupItem, String> {

	@Query(value = "select * from lookup_item where requestid = ?1 order by qty desc", nativeQuery = true)
	List<LookupItem> findbyrequestid(String requestid);
}