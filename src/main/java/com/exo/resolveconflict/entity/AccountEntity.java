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

  private String fullnames;

  private String passwords;

  private String birthdays;

  private String emails;

  private String phones;

  private String bbb;



  private String abc;


  private String address;
}
