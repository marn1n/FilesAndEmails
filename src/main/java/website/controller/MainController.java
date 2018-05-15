package website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import website.Service.ClientService;
import website.Service.MailService;
import website.entity.Client;

import java.io.File;
import java.io.IOException;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @Autowired
    private ClientService clientService;
    @Autowired
    private MailService mailService;
    @PostMapping("/send")
    public String home(Client client
                       /*, @RequestParam ("ava") MultipartFile file*/) throws IOException {
//        String path = System.getProperty("user.home") + File.separator + "files" + File.separator;
//        file.transferTo(new File(path + file.getOriginalFilename()));

        clientService.save(client);
//        mailService.sendEmail(client);
        return "redirect:/";
    }
    @GetMapping("/rest")
    public String rest(){
        return "rest";
    }
}
