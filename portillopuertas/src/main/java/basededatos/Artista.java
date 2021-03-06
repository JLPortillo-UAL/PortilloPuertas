/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Artista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioComunId", referencedColumnName="Id")
public class Artista extends basededatos.UsuarioComun implements Serializable {
	public Artista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTISTA_CREA_ALBUM) {
			return ORM_crea_album;
		}
		else if (key == ORMConstants.KEY_ARTISTA_PUBLICA_EVENTOS) {
			return ORM_publica_eventos;
		}
		else if (key == ORMConstants.KEY_ARTISTA_TIENE_CANCIONES) {
			return ORM_tiene_canciones;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ARTISTA_ES_DADO_DE_ALTA) {
			this.es_dado_de_alta = (basededatos.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="NombreArtista", nullable=true, length=255)	
	private String nombreArtista;
	
	@ManyToOne(targetEntity=basededatos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioComunId", referencedColumnName="UsuarioComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKArtista251431"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Administrador es_dado_de_alta;
	
	@OneToMany(mappedBy="pertenece_a_artista", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_album = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_publicado", targetEntity=basededatos.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica_eventos = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece_a_artistaCancion", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene_canciones = new java.util.HashSet();
	
	public void setNombreArtista(String value) {
		this.nombreArtista = value;
	}
	
	public String getNombreArtista() {
		return nombreArtista;
	}
	
	private void setORM_Crea_album(java.util.Set value) {
		this.ORM_crea_album = value;
	}
	
	private java.util.Set getORM_Crea_album() {
		return ORM_crea_album;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection crea_album = new basededatos.AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_CREA_ALBUM, ORMConstants.KEY_ALBUM_PERTENECE_A_ARTISTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Publica_eventos(java.util.Set value) {
		this.ORM_publica_eventos = value;
	}
	
	private java.util.Set getORM_Publica_eventos() {
		return ORM_publica_eventos;
	}
	
	@Transient	
	public final basededatos.EventoSetCollection publica_eventos = new basededatos.EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_PUBLICA_EVENTOS, ORMConstants.KEY_EVENTO_ES_PUBLICADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEs_dado_de_alta(basededatos.Administrador value) {
		if (es_dado_de_alta != null) {
			es_dado_de_alta.da_de_alta_artista.remove(this);
		}
		if (value != null) {
			value.da_de_alta_artista.add(this);
		}
	}
	
	public basededatos.Administrador getEs_dado_de_alta() {
		return es_dado_de_alta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_dado_de_alta(basededatos.Administrador value) {
		this.es_dado_de_alta = value;
	}
	
	private basededatos.Administrador getORM_Es_dado_de_alta() {
		return es_dado_de_alta;
	}
	
	private void setORM_Tiene_canciones(java.util.Set value) {
		this.ORM_tiene_canciones = value;
	}
	
	private java.util.Set getORM_Tiene_canciones() {
		return ORM_tiene_canciones;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection tiene_canciones = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_TIENE_CANCIONES, ORMConstants.KEY_CANCION_PERTENECE_A_ARTISTACANCION, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
