package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-favoritos")
@JsModule("./src/vistas/vista-favoritos.ts")
public class VistaFavoritos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulolabel")
	private Label titulolabel;
	@Id("artistalabel")
	private Label artistalabel;
	@Id("albumlabel")
	private Label albumlabel;
	@Id("duracionlabel")
	private Label duracionlabel;
	@Id("bt_Izq")
	private Button bt_Izq;
	@Id("bt_Der")
	private Button bt_Der;
	@Id("HorizontalCancion")
	private HorizontalLayout horizontalCancion;
	/**
     * Creates a new VistaFavoritos.
     */
    public VistaFavoritos() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Label getTitulolabel() {
		return titulolabel;
	}
	public void setTitulolabel(String titulolabel) {
		this.titulolabel.setText(titulolabel);
	}
	public Label getArtistalabel() {
		return artistalabel;
	}
	public void setArtistalabel(String artistalabel) {
		this.artistalabel.setText(artistalabel);
	}
	public Label getAlbumlabel() {
		return albumlabel;
	}
	public void setAlbumlabel(String albumlabel) {
		this.albumlabel.setText(albumlabel);
	}
	public Label getDuracionlabel() {
		return duracionlabel;
	}
	public void setDuracionlabel(String duracionlabel) {
		this.duracionlabel.setText(duracionlabel);
	}
	public Button getBt_Izq() {
		return bt_Izq;
	}
	public void setBt_Izq(Button bt_Izq) {
		this.bt_Izq = bt_Izq;
	}
	public Button getBt_Der() {
		return bt_Der;
	}
	public void setBt_Der(Button bt_Der) {
		this.bt_Der = bt_Der;
	}
	public HorizontalLayout getHorizontalCancion() {
		return horizontalCancion;
	}
	public void setHorizontalCancion(HorizontalLayout horizontalCancion) {
		this.horizontalCancion = horizontalCancion;
	}

	

}
