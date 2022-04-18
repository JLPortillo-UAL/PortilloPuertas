package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Cancion__Registrado_;
import vistas.VistaCancion_anterior;
import vistas.VistaUltimas_reproducciones;

public class Ultimas_reproducciones extends VistaUltimas_reproducciones{
	public Pagina_principal _pagina_principal;
	public Vector<Cancion_anterior> _list_cancion__registrado_ = new Vector<Cancion_anterior>();
	
	public Ultimas_reproducciones() {
		
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {

		CargarCanciones(vlpadre);

		Scroller scroller = this.getScroll();
		scroller.getStyle().set("height", "40%");

		//Div div = new Div();

		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
//		tempHl.getStyle().set("height", "40%");
		tempHl.getStyle().set("padding-left", "5%");
		
		for (int i = 0; i < _list_cancion__registrado_.size(); i++) {
			
			
			tempHl.add(_list_cancion__registrado_.get(i));
		}

		//div.add(tempHl);

		scroller.setContent(tempHl);

	}

	public void CargarCanciones(VerticalLayout vl) {
		Cancion_anterior cancion;

		for (int i = 0; i < 20; i++) {
			cancion = new Cancion_anterior(vl);

			_list_cancion__registrado_.add(cancion);
		}

	}
}