/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruposcout.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jesu
 */

@Embeddable
public class Comentario_Id implements Serializable {
    
    @Column (length=30)
    private Long idSocio;
    @Column (length=30)
    private String id_evento;
    @Temporal (TemporalType.TIMESTAMP)
    private Date fecha;
}
