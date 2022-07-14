package com.ciandt.template.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bem_vindo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BemVindo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;
}
