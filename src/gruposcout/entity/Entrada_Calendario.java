/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruposcout.entity;

import com.sun.jndi.cosnaming.IiopUrl.Address;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 *
 * @author jesu
 */
@Entity
@Access (AccessType.FIELD)
public class Entrada_Calendario implements Serializable {
    
    @EmbeddedId @GeneratedValue
    @Column (name = "ID",length = 30, nullable=false)
    private Entrada_Calendario_Id id;
    @Column (name = "Descripción", length = 200, nullable=false)
    private String descripcion;
    // Falta tamaño en el modelo lógico
    @Column (name="Categoría", length = 50,nullable=false)
    private String categoria;
    @ManyToOne
    private Long socio = Socio.getId();
    
    
    public Entrada_Calendario_Id getId() {
        return id;
    }
    
   
    public String getDescripcion(){
        return descripcion;
    }
    
    
    public String getCategoria(){
        return categoria;
    }

    public void setId(Entrada_Calendario_Id id) {
        this.id = id;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public void setCategoria(String categoria){
        this.categoria=categoria;
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
        if (!(object instanceof Entrada_Calendario)) {
            return false;
        }
        Entrada_Calendario other = (Entrada_Calendario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega1_scouts.Entrada_Calendario[ id=" + id + " ]";
    }
    
}
