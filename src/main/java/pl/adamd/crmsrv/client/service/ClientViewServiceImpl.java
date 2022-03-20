package pl.adamd.crmsrv.client.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientViewServiceImpl implements ClientViewService {
    private final ClientService clientService;
}
