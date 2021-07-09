package com.example.springkt;

import org.springframework.stereotype.Service;

public interface ResetService {

  Counter reset();
}

@Service
class ResetServiceImpl implements ResetService {

  @Override
  public Counter reset() {
    return new Counter();
  }
}
