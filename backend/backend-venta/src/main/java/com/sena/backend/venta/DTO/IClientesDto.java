package com.sena.backend.venta.DTO;

public interface IClientesDto extends IGenericDto {
    
    Long getCliente_id();
    String getType_document();
    String getDocument();
    String getName();
    String getLast_Name();
    String getPhone();
    String getAddress(); 
    String getCity();
    Boolean getState();

    
}
