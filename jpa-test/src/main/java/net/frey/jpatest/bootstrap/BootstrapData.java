package net.frey.jpatest.bootstrap;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.frey.jpatest.repository.ProblemzRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final ProblemzRepository problemzRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        problemzRepository.findAll();
    }
}
