package website.Service;

import website.entity.Client;

import java.util.List;

public interface ClientService {

    void save(Client client);
    List<Client> findAll();
}
