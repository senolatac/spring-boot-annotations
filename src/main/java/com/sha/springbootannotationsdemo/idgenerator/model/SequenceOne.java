package com.sha.springbootannotationsdemo.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:37
 */
@Data
@Entity//entity
@Table(name = "sequence_one")//db_table_name
public class SequenceOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_one_generator")
    @SequenceGenerator(name = "sequence_one_generator", sequenceName = "sequence_one_id", allocationSize = 1)
    private Long id;

    private String name;
}
