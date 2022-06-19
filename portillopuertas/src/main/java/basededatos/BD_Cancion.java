package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.Cancion__Registrado_;

public class BD_Cancion {
	public BDPrincipal _bd_principal_cancion;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public Cancion__Registrado_ cargarCancion(int aId) {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_mas_escuchadas() {
		throw new UnsupportedOperationException();
	}

	public void darAltaCancion(String aNombre, String aArtista, String aEstilo, String aProductor, String acompositor,
			int aDuracion, String aImagen, String archivoMultimedia) throws PersistentException {
		int id_cancion = -1;
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		
		EstiloCriteria c = new EstiloCriteria();
		c.nombre.like(aEstilo);
		
		ArtistaCriteria cArtista = new ArtistaCriteria();
		cArtista.nombreArtista.like(aArtista);
		
		Estilo estilo = EstiloDAO.loadEstiloByCriteria(c);
		Artista artista = ArtistaDAO.loadArtistaByCriteria(cArtista);
		try {

			Administrador admin =AdministradorDAO.getAdministradorByORMID(1);
			
			
			Cancion cancion = CancionDAO.createCancion();
			cancion.setTitulo(aNombre);
			cancion.setArtista(aArtista);
			cancion.setEstilo(aEstilo);
			cancion.setProductor(aProductor);
			cancion.setCompositor(acompositor);
			cancion.setDuracion(aDuracion);
			cancion.setImagen_cancion(aImagen);
			cancion.setNumReproducciones(0);
			cancion.setFicheroMultimedia(archivoMultimedia);
			cancion.setEs_dada_de_alta(admin);
			cancion.setPertenece_a_estilo(estilo);
			cancion.setORM_Pertenece_a_artistaCancion(artista);
			CancionDAO.save(cancion);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public List busqueda_cancion(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			List cancion = CancionDAO.queryCancion("Nombre = '" + aNombre + "'", null);
			return cancion;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}
}