/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto1.reto1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import org.springframework.lang.NonNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author MANDO
 */

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name="user", indexes = @Index(name = "indx_email", columnList="user_email", unique = true))

/*Declaramos los campos mapeados de la BD*/
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    @Column(name = "user_mail", nullable = false, length = 50)
    private String email;
    @NonNull
    @Column(name = "user_password", nullable = false, length = 50)
    private String password;
    @NonNull
    @Column(name = "user_name", nullable = false, length = 80)
    private String name;
}
