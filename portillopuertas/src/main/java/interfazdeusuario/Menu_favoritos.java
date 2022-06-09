package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_favoritos;

public class Menu_favoritos extends VistaMenu_favoritos {
//	private Label _favoritosL;
//	private Button _reproducir_favoritosB;
	public Menu _menu;
	public Favoritos _favoritos;
	public Reproducir_favoritos _reproducir_favoritos;

	public Menu_favoritos() {
//		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		CargarFavoritos(vl);
	}
	
	
	public void CargarFavoritos(VerticalLayout vl) {
		Favoritos fav;
		//System.out.println(inicio.arrayCanciones.size());

		for (int i = 0; i <inicio.arrayCanciones.size(); i++) {
			fav = new Favoritos(vl);
			fav.getStyle().set("width","100%");		
			fav.setTitulolabel(inicio.arrayCanciones.get(i).getNombre());
			fav.setAlbumlabel(inicio.arrayCanciones.get(i).getAlbum());
			fav.setArtistalabel(inicio.arrayCanciones.get(i).getArtista());
			fav.setDuracionlabel(Integer.toString(inicio.arrayCanciones.get(i).getDuracion()));

			vl.add(fav);
		}
	}
}