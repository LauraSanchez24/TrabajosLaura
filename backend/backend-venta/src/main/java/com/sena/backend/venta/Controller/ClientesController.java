package com.sena.backend.venta.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.backend.venta.IService.IClientesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/clientes")
public class ClientesController extends ABaseController<com.sena.backend.venta.Entity.Clientes,com.sena.backend.venta.IService.IClientesService> {
    public ClientesController(IClientesService service) {
        super(service, "clientes");

    }
}