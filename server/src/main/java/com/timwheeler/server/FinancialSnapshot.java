package com.timwheeler.server;

import org.springframework.lang.NonNull;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

public class FinancialSnapshot {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String symbol;
    private @NonNull String companyName;
    private @NonNull String lastPrice;
    private @NonNull String change;
    private @NonNull String percentChange;
}
