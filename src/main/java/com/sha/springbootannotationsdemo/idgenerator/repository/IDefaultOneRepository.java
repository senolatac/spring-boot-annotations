package com.sha.springbootannotationsdemo.idgenerator.repository;

import com.sha.springbootannotationsdemo.idgenerator.model.DefaultOne;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:30
 */
public interface IDefaultOneRepository extends JpaRepository<DefaultOne, Long>
{
}
