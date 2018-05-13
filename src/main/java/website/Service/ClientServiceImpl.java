package website.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import website.dao.ClientDAO;
import website.entity.Client;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDAO clientDAO;
    public void save(Client client) {
        clientDAO.save(client);
    }

    public List<Client> findAll() {
        return clientDAO.findAll();
    }
}
