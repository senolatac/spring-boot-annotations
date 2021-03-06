package com.sha.springbootannotationsdemo.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:42
 */
@Data
@Entity//entity
@Table(name = "table_one")//db_table_name
public class TableOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table_one_generator")
    @TableGenerator(name = "table_one_generator", table = "table_one_id_generator", allocationSize = 1)
    private Long id;

    private String name;
}
