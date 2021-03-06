package com.sha.springbootannotationsdemo.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author sa
 * @date 6.03.2021
 * @time 14:34
 */
@Data
@Entity//entity
@Table(name = "identity_one")//db_table_name
public class IdentityOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
