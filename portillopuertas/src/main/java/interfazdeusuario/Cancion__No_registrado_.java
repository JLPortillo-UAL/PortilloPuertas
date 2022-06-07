package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion_no_registrado;

public class Cancion__No_registrado_ extends VistaCancion_no_registrado {
//	private Label _nombre_playlistL;
//	private Label _nombre_cancionL;
//	private Label _nombre_artistaL;
//	private ProgressBar _tiempo_cancionPB;
//	private Button _creditosB;
//	private Button _registrarseB;
//	private Button _iniciar_sesionB;
//	private Slider _volumenS;
	public Novedades _novedades;
	public Avanzar_10s _avanzar_10s;
	public Creditos _creditos;
	public Retroceder_10s _retroceder_10s;
	public Volumen _volumen;
	public Siguiente_cancion _siguiente_cancion;
	public Cancion_anterior _cancion_anterior;
	public Play_pause _play_pause;
	public Poner_en_bucle _poner_en_bucle;

	public Cancion__No_registrado_() {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%").set("height", "100%");
		inicializar(new VerticalLayout());
	}

	public void inicializar(VerticalLayout vlpadre) {

		this.getMin_cancion_no_registrado().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Pagina_Principal__No_registrado_ pagina_noregistrado = new Pagina_Principal__No_registrado_();
				pagina_noregistrado.getStyle().set("width", "100%");
				pagina_noregistrado.getStyle().set("height", "100%");
				vlpadre.add(pagina_noregistrado);

			}
		});

		this.getCreditos_no_registrado().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Creditos creditos = new Creditos();
				creditos.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(creditos);
				creditos.inicializar(vlpadre);
			}
		});
		
		Barra_reproduccion barra_reproduccion = new Barra_reproduccion();
		barra_reproduccion.getStyle().set("width", "100%").set("height", "100%");
		
		vlpadre.add(barra_reproduccion);

	}
}