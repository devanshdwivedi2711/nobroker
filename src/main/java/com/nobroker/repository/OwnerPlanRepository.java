package com.nobroker.repository;

import com.nobroker.entity.OwnerPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OwnerPlanRepository extends JpaRepository<OwnerPlan , Long> {
}
