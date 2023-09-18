package com.example;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component
@Lazy
public interface SIM {
    void message();

    void call();
}

