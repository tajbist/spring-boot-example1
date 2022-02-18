package com.io.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @Column(name = "custId", nullable = false)
    private Integer custId;
    private String firstName;
    private String LastName;
}
