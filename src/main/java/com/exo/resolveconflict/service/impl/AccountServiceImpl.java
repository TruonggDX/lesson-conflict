package com.exo.resolveconflict.service.impl;

import com.exo.resolveconflict.entity.AccountEntity;
import com.exo.resolveconflict.repository.AccountRepository;
import com.exo.resolveconflict.service.IAccountService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

  private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);
  private final AccountRepository accountRepository;

  @Override
  public List<AccountEntity> findAll() {
    log.info("Find all accounts hehe kaakak {}", accountRepository.findAll());
    return accountRepository.findAll();
  }

  @Override
  public Optional<AccountEntity> findById(Long id) {
    log.info("Find account by id hi {}", id);
    return accountRepository.findById(id);
  }

  @Override
  public AccountEntity save(AccountEntity account) {
    log.info("Save account hehe {}", account);
    return accountRepository.save(account);
  }

  @Override
  public void deleteById(Long id) {
    log.info("Delete account by hehe id {}", id);
    accountRepository.deleteById(id);
  }
}
