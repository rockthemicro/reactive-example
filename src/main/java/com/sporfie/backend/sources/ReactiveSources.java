package com.sporfie.backend.sources;

import reactor.core.publisher.Flux;

public class ReactiveSources {
    public static Flux<String> stringFlux() {
        return Flux.just(
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten"
        );
    }

    public static Flux<Integer> intFlux() {
        return Flux.just(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );
    }
}
