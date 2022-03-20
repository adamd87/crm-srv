package pl.adamd.crmsrv.client.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adamd.crmsrv.client.service.ClientViewService;

@RestController
@RequestMapping("/api/clients")
@AllArgsConstructor
class ClientController {
    private final ClientViewService clientViewService;
}
