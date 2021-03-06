package com.sha.springbootannotationsdemo.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:27
 */
@Data
@Entity//entity
@Table(name = "default_one")//db_table_name
public class DefaultOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
