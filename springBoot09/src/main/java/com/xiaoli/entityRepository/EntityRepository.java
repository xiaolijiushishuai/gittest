package com.xiaoli.entityRepository;

import com.xiaoli.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EntityRepository extends JpaRepository<Entity,Integer> {

}
