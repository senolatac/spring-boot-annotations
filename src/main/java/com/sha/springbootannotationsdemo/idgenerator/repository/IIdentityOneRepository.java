package com.sha.springbootannotationsdemo.idgenerator.repository;

import com.sha.springbootannotationsdemo.idgenerator.model.IdentityOne;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:35
 */
public interface IIdentityOneRepository extends JpaRepository<IdentityOne, Long>
{
}
