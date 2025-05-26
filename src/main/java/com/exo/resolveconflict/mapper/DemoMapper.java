package com.exo.resolveconflict.mapper;

import com.exo.resolveconflict.dto.AccountDto;
import com.exo.resolveconflict.entity.AccountEntity;

public class DemoMapper {

  public AccountDto toDto(AccountEntity account) {
    return AccountDto.builder().build();
  }
}
