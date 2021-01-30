package com.zeger.demorestful.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Pavel Zeger
 * @implNote demo-restful
 * @since 30/01/2021
 */
@AllArgsConstructor
@Getter
@Setter
public class Task {

    private Long id;
    private String name;

}
