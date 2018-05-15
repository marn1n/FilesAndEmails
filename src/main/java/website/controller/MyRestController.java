package website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import website.Service.ClientService;
import website.entity.Client;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private ClientService clientService;
    @GetMapping("/giveUsers")
    public List<Client> giveUsers(){
        return clientService.findAll();
    }

//    @PostMapping("/saveUser")
//    public void saveUser(@RequestBody Client client){
//        clientService.save(client);
//    }

    @PutMapping("/saveUser/{xxx}")
//    @RequestMapping(method = RequestMethod.PUT, value = "/saveUser/{xxx}")
    public void saveUserAgain(
            @PathVariable("xxx") String email
    ) {
        Client client = new Client();
        client.setEmail(email);
        clientService.save(client);
    }


}
