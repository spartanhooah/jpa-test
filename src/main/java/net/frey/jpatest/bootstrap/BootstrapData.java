package net.frey.jpatest.bootstrap;

import lombok.RequiredArgsConstructor;
import net.frey.jpatest.repository.ProblemzRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final ProblemzRepository problemzRepository;

    @Override
    public void run(String... args) {
        System.out.println(problemzRepository.findAll());
    }
}
