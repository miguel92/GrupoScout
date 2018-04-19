/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruposcout.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author jesu
 */
@Entity
@Access (AccessType.FIELD)
public class Notificacion_Documento implements Serializable {

    @EmbeddedId @GeneratedValue
    @Column(name="ID",length=30, nullable=false)
    private Notificacion_Documento_Id id;
    @Column(name="Estado", length=10,nullable=false)
    private String estado;
    @ManyToOne
    private Long socio = Socio.getId();
    @ManyToOne
    private Long documento = Documento.getId();

    public Notificacion_Documento_Id getId() {
        return id;
    }
    
    public String getEstado(){
        return estado;
    }

    public void setId(Notificacion_Documento_Id id) {
        this.id = id;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion_Documento)) {
            return false;
        }
        Notificacion_Documento other = (Notificacion_Documento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega1_scouts.Notificacion_Documento[ id=" + id + " ]";
    }
    
}
