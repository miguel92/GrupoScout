/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruposcout.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author jesu
 */
@Embeddable
public class Entrada_Calendario_Id implements Serializable{
    
    private Long idSocio;
    @Temporal (TemporalType.DATE)
    private Date fecha;
}