package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String nome;
    private String apellpaterno;
    private String apellmaterno;
    private String rfc;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @ColumnName("apellpaterno")
    public String getApellpaterno() {
        return apellpaterno;
    }

    public void setApellpaterno(String apellpaterno) {
        this.apellpaterno = apellpaterno;
    }

    @ColumnName("apellmaterno")
    public String getApellmaterno() {
        return apellmaterno;
    }

    public void setApellmaterno(String apellmaterno) {
        this.apellmaterno = apellmaterno;
    }
    
    @ColumnName("RFC")
    public String Rfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    
}
