package com.sha.springbootannotationsdemo.idgenerator.repository;

import com.sha.springbootannotationsdemo.idgenerator.model.SequenceOne;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:39
 */
public interface ISequenceOneRepository extends JpaRepository<SequenceOne, Long>
{
}
