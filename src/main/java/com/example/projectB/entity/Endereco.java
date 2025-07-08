package com.example.projectB.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="rua")
    private String rua;
    @Column(name="numero")
    private Long numero;
    @Column(name="complemento",length=15)
    private String complemento;
    @Column(name="cidade")
    private String  cidade;
    @Column(name="estado",length=2)
    private String estado;
    @Column(name="cep",length=9)
    private Long cep;

    @OneToMany( cascade=CascadeType.ALL)
    @JoinColumn (name ="usuario_id",referencedColumnName="id")
    private List<Telefone> telefone;
}
