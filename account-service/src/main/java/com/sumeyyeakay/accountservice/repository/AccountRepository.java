package com.sumeyyeakay.accountservice.repository;

import com.sumeyyeakay.accountservice.model.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<Account, String> {
}