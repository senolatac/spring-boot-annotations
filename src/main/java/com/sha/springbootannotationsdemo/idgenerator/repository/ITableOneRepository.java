package com.sha.springbootannotationsdemo.idgenerator.repository;

import com.sha.springbootannotationsdemo.idgenerator.model.TableOne;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:44
 */
public interface ITableOneRepository extends JpaRepository<TableOne, Long>
{
}
