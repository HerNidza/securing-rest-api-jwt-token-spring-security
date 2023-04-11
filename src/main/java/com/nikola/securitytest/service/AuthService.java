package com.nikola.securitytest.service;

import com.nikola.securitytest.payload.LoginDto;
import com.nikola.securitytest.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
