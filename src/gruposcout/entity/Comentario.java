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
public class Comentario implements Serializable {

    @Id @GeneratedValue
    @Column (name = "ID",length =30, nullable=false)
    private Comentario_Id id;
    @Column (length = 255, nullable=false)
    private String Texto;
    @ManyToOne
    private Socio socio;
    @ManyToOne
    private Evento evento;

    public Comentario_Id getId() {
        return id;
    }
    
    public String getTexto(){
        return Texto;
    }

    public void setId(Comentario_Id id) {
        this.id = id;
    }
    
    public void setTexto(String Texto){
        this.Texto=Texto;
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
        if (!(object instanceof Comentario)) {
            return false;
        }
        Comentario other = (Comentario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega1_scouts.Comentario[ id=" + id + " ]";
    }
    
}
