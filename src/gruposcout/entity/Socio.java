/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruposcout.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tilted-Shugar
 */
@Entity
public class Socio extends Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dni;
    @Column(name = "nombre", nullable = false, length=30)
    private String nombre;
    @Column(name = "apellidos", nullable = false, length=30)
    private String apellidos;
    private String grupo;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;
    @Column(name = "sexo", nullable = false)
    private boolean sexo;
    @Column(name = "direccion", nullable = false, length=30)
    private String direccion;
    @Column(name = "telefono", nullable = false, length=10)
    private Integer telefono;
    @Column(name = "telefono_movil", nullable = false, length=10)
    private Integer telefono_movil;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_ingreso", nullable = false)
    private Date fecha_ingreso;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_baja", nullable = false)
    private Date fecha_baja;
    private String cargo;
    private String ambito;
    private String info_tutores;
    @Temporal(TemporalType.DATE)
    private Date fecha_firma;
    @Column(name = "localizacion", nullable = false)
    private String localizacion;
    private String perfil;

//--NACHO    
    @OneToMany(mappedBy="socio")
    private List <Transaccion> transacciones;
    
    @OneToMany(mappedBy="socio")
    private List <Pago_Cuota> pago_cuotas;

//--BROJA
    @ManyToMany
    private List <Evento> asistentes;
    
    @ManyToMany
    private List <Evento> inscritos;
    
    @ManyToOne
    private Seccion seccion;
    
    @OneToMany(mappedBy="socio")
    private List <Notificacion_Evento> notificacionEvento;
//--
    @OneToMany(mappedBy="EntradaCalendario")
    private List <Entrada_Calendario> entradaCalendarios;
    @OneToMany(mappedBy="socio")
    private List <Documento> documentos;
    @OneToMany(mappedBy="socio")
    private List <Pago_Evento> pago_eventos;
    @OneToMany(mappedBy="socio")
    private List <Notificacion_Documento> notificacionDocumento;
    @OneToMany(mappedBy="socio")
    private List <Comentario> comentario;
    
    //--------------------

    public <any> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(<any> transacciones) {
        this.transacciones = transacciones;
    }
    public <any> getPago_cuotas() {
        return pago_cuotas;
    }

    public void setPago_cuotas(<any> pago_cuotas) {
        this.pago_cuotas = pago_cuotas;
    }

    public <any> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(<any> asistentes) {
        this.asistentes = asistentes;
    }

    public <any> getInscritos() {
        return inscritos;
    }

    public void setInscritos(<any> inscritos) {
        this.inscritos = inscritos;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public <any> getNotificacionEvento() {
        return notificacionEvento;
    }

    public void setNotificacionEvento(<any> notificacionEvento) {
        this.notificacionEvento = notificacionEvento;
    }

    public <any> getEntradaCalendarios() {
        return entradaCalendarios;
    }

    public void setEntradaCalendarios(<any> entradaCalendarios) {
        this.entradaCalendarios = entradaCalendarios;
    }

    public <any> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(<any> documentos) {
        this.documentos = documentos;
    }

    public <any> getPago_eventos() {
        return pago_eventos;
    }

    public void setPago_eventos(<any> pago_eventos) {
        this.pago_eventos = pago_eventos;
    }

    public <any> getNotificacionDocumento() {
        return notificacionDocumento;
    }

    public void setNotificacionDocumento(<any> notificacionDocumento) {
        this.notificacionDocumento = notificacionDocumento;
    }

    public <any> getComentario() {
        return comentario;
    }

    public void setComentario(<any> comentario) {
        this.comentario = comentario;
    }
 
    //--------------------
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(Integer telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getInfo_tutores() {
        return info_tutores;
    }

    public void setInfo_tutores(String info_tutores) {
        this.info_tutores = info_tutores;
    }

    public Date getFecha_firma() {
        return fecha_firma;
    }

    public void setFecha_firma(Date fecha_firma) {
        this.fecha_firma = fecha_firma;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Socio)) {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega_1.Socio[ id=" + id + " ]";
    }
    
}
