package com.exo.resolveconflict.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "accounts")
public class AccountEntity extends BaseEntity {

  private String fullname;

  private String password;

  private String birthday;

  private String email;

  private String phone;

  private String address;
}
