package com.olympus.olympushotel.seeders;

import com.github.javafaker.Faker;
import com.olympus.olympushotel.entities.Cliente;
import com.olympus.olympushotel.repositories.IClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Component
public class ClienteSeeder implements CommandLineRunner {
    private final IClienteRepository clienteRepository;
    private final Faker faker;

    public ClienteSeeder(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) {
        // Crear datos de prueba aleatorios
       /*for (int i = 0; i < 97; i++) {
            Cliente cliente = new Cliente();
            cliente.setNombre(faker.name().fullName());
            cliente.setApellidos(faker.name().fullName());
            cliente.setCorreo(faker.toString());
            cliente.setTelefono(faker.number().digits(10));
            cliente.setTimestampColumn(convertToLocalDateTime(faker.date().between(new Date(), new Date())));
            clienteRepository.save(cliente);
       }*/
    }

    private LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}