package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.UsuarioComun;
import vistas.VistaMenu;

public class Menu extends VistaMenu {
//	private Button _listas_reproduccionB;
//	private Button _favoritosB;
//	private Button _configuracionB;
	public Perfil_usuario _perfil_usuario;
	public Menu_playlist _menu_playlist;
	public Menu_favoritos _menu_favoritos;
	public Datos_usuario _datos_usuario;
	public Configuracion _configuracion;

	public Menu() {
		//inicializar(new VerticalLayout(), new UsuarioComun());
	}

	public void inicializar(VerticalLayout vltotal, VerticalLayout vlpadre, UsuarioComun usuario) {

		this.setNombre_menu(usuario.getNombreUsuario());
		this.getImgMenu().setSrc(usuario.getFoto());	
		this.getSeguidores_menu().setVisible(false);
		
		this.getLista_reproduccion_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_playlist menu_playlist = new Menu_playlist(usuario);
				menu_playlist.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(menu_playlist);

			}
		});

		this.getFav_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_favoritos favoritos = new Menu_favoritos(usuario);
				favoritos.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(favoritos);

			}

		});

		this.getHome_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vlpadre.removeAll();

				Pagina_principal pagina_p = new Pagina_principal(true);
				pagina_p.getStyle().set("width", "100%");
				pagina_p.getStyle().set("height", "100%");
				vlpadre.add(pagina_p);
				pagina_p.inicializar2(vltotal, usuario);
			}

		});

		this.getConfig_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Configuracion config = new Configuracion(usuario);
				config.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(config);
				config.inicializar(vltotal, vlpadre,usuario);

			}

		});
	}
}