package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaLista_canciones;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-playlist template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-playlist")
@JsModule("./src/vistas/vista-playlist.ts")
public class VistaPlaylist extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCabecera_registrado")
	private VistaCabecera_registrado vistaCabecera_registrado;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label")
	private Label label;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("label1")
	private Label label1;
	@Id("hr")
	private Hr hr;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("vaadinButton3")
	private Button vaadinButton3;
	@Id("vistaLista_canciones")
	private VistaLista_canciones vistaLista_canciones;
	@Id("vistaBarra_reproduccion")
	private VistaBarra_reproduccion vistaBarra_reproduccion;

	/**
     * Creates a new VistaPlaylist.
     */
    public VistaPlaylist() {
        // You can initialise any data required for the connected UI components here.
    }

}
