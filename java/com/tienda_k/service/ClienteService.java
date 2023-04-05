package com.tienda_k.service;

import com.tienda_k.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    // Se obtiene un listado de clientes en un List
    public List<Cliente> getClientes();
    
    // Se obtiene un Cliente, a partir del id de un cliente
    public Cliente getCliente(Cliente cliente);
    
    // Se inserta un nuevo cliente si el id del cliente esta vacío
    // Se actualiza un cliente si el id del cliente NO esta vacío
    public void save(Cliente cliente);
    
    // Se elimina el cliente que tiene el id pasado por parámetro
    public void delete(Cliente cliente);
    
}
