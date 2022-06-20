package interfazdeusuario;

import com.example.test.AudioPlayer;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import vistas.VistaBarra_reproduccion;

// import basededatos.iUsuario_registrado;

public class Barra_reproduccion extends VistaBarra_reproduccion {
	public Minimizar _minimizar;
	// public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Maximizar _maximizar;
	AudioPlayer audio = new AudioPlayer();

	public Barra_reproduccion(Cancion cancion) {
		inicializar(cancion);
		VerticalLayout vl = this.getAudioplayer().as(VerticalLayout.class);
		audio.getElement().getStyle().set("width", "75%").set("align-self", "center");
		vl.add(audio);
	}
	
	public void inicializar(Cancion cancion) {

		audio.setSource(cancion.getFicheroMultimedia());
		setCancion_barra(cancion.getTitulo());
		setAutor_barra(cancion.getArtista());	
	}
	
}