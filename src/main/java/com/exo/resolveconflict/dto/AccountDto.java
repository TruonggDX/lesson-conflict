package com.exo.resolveconflict.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AccountDto {

  private Long id;

  private String fullname;

  private String password;

  private String birthday;

  private String email;

  private String phone;

  private String address;
}
